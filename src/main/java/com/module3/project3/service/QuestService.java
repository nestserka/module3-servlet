package com.module3.project3.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.module3.project3.entity.JsonParser;
import com.module3.project3.entity.Quest;
import com.module3.project3.entity.QuestQuestions;
import com.module3.project3.repository.QuestRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestService {

    QuestRepository questRepository = new QuestRepository();

    QuestQuestionsService questQuestionsService = new QuestQuestionsService();
    private static List <Quest> quests = new ArrayList<>();

    public void createQuestList() throws JsonProcessingException {
        quests = questRepository.createNewQuests();
        JsonParser jsonParser = new JsonParser();
        jsonParser.createJsonFile(quests);
    }

    public void findListOfQuests(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Quest> quests = questRepository.findListOfQuests();
        for (Quest q : quests){
            req.setAttribute("questId_" + q.getId(), q.getId());
        }
        req.setAttribute("quests", quests);
        req.getRequestDispatcher("/WEB-INF/quest_list.jsp").forward(req, resp);
        }

    public void fetchIntroPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Quest quest = questRepository.fetchQuestById(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("id", Integer.parseInt(req.getParameter("id")));
        req.setAttribute("questName", quest.getQuestName());
        req.setAttribute("description", quest.getDescription());
        HttpSession session = req.getSession(false);
        session.setAttribute("questName", quest.getQuestName());
        List <QuestQuestions> qsList = questQuestionsService.fetchListOfQuestions(Integer.parseInt(req.getParameter("id")));
        if (!qsList.isEmpty()) {
            QuestQuestions firstQuestion = qsList.get(0);
            req.setAttribute("firstQuestion", firstQuestion);
        }
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
