package com.module3.project3.controller;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.module3.project3.entity.QuestQuestions;
import com.module3.project3.service.QuestQuestionsService;
import com.module3.project3.service.QuestService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;



@WebServlet(name = "questServlet", value = "/quest")
public class QuestServlet extends HttpServlet {

    QuestService questService = new QuestService();
    QuestQuestionsService questQuestionsService = new QuestQuestionsService();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session != null) {
            String userJson = (String) session.getAttribute("user");
            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(userJson).getAsJsonObject();
            long id = jsonObject.get("id").getAsLong();
            req.setAttribute("userId", id);
        }
        String qsValue = req.getParameter("qs");
        String qsId = req.getParameter("id");
        if (qsValue == null && qsId == null) {
            questService.findListOfQuests(req, resp);
        } else if (qsId != null && qsValue == null) {
            questService.fetchIntroPage(req, resp);
        } else if (qsId != null && qsValue != null) {
            questQuestionsService.findQuestData(req, resp, qsId, qsValue);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String requestURL = req.getRequestURL().toString();
        String qsValue = req.getParameter("qs");
        String qsId = req.getParameter("id");
        if (qsId != null && qsValue.equals("Q-2")){
            String placeValue = req.getParameter("place");
            req.setAttribute("place", placeValue);
            String redStr = requestURL +"?id="+ qsId +"&qs="+qsValue;
            resp.sendRedirect(redStr);
        }
    }
}

