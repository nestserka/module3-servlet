package com.module3.project3.service;


import com.module3.project3.entity.QuestQuestions;
import com.module3.project3.repository.QuestQuestionRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

public class QuestQuestionsService {

    QuestQuestionRepository questQuestionRepository = new QuestQuestionRepository();

    public List<QuestQuestions> fetchListOfQuestions(int id) {
        return questQuestionRepository.fetchListOfQuestions(id);
    }

    public QuestQuestions fetchQuestionById(int id, String qsValue) {
        List<QuestQuestions> questionsList = fetchListOfQuestions(id);
        for (QuestQuestions question : questionsList) {
            if (question.getQsNo().equals(qsValue) && question.getQsType().equals("result")) {
                QuestQuestions qs = new QuestQuestions();
                qs.setQsNo(question.getQsNo());
                qs.setQsDescription(question.getQsDescription());
                qs.setQsType(question.getQsType());
                return qs;
            } else if (question.getQsNo().equals(qsValue)){
               return question;
            }
        }
        return null;
    }


    public void findQuestData (HttpServletRequest req, HttpServletResponse resp, String qsId, String qsValue) throws ServletException, IOException {
        QuestQuestions question =fetchQuestionById(Integer.parseInt(qsId), qsValue);
        String title = "";
        if (question.getQsNo().contains("Q")) {
            String[] parts = qsValue.split("-");
            if (parts.length >= 2) {
                String numericPart = parts[1];
                title = "QUESTION " + numericPart;
            }
        } else {
            title = "RESULT";
            String[] parts = qsValue.split("-");
            if (parts.length >= 2) {
                String numericPart = parts[1];
                checkWins(numericPart, req);
            }
        }
        HttpSession session = req.getSession(false);
        String questName = (String) session.getAttribute("questName");
        req.setAttribute("questName", questName);
        req.setAttribute("id", qsId);
        req.setAttribute("question", question);
        req.setAttribute("title", title);
        req.getRequestDispatcher("WEB-INF/quest_room.jsp").forward(req, resp);
    }

    public void checkWins(String resultValue, HttpServletRequest req) {
        HttpSession session = req.getSession(false);
        if (session == null) {
            throw new NullPointerException("Session is null. Cannot proceed.");
        }
        Integer winCount = (Integer) session.getAttribute("winCount");
            if (winCount != null) {
                if (resultValue.equals("4") || resultValue.equals("5") || resultValue.equals("7")) {
                    winCount++;
                    session.setAttribute("winCount", winCount);
                }
            } else {
                session.setAttribute("winCount", 0);
            }
    }
}

