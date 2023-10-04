package com.module3.project3.controller;

import com.module3.project3.service.QuestService;
import com.module3.project3.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "initServlet", value = "/login")
public class InitServlet extends HttpServlet {

    UserService userService = new UserService();
//    QuestService questService = new QuestService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ** parse was called in order to create the json file for the quests
//        questService.createQuestList();
        String userId = req.getParameter("user");
        boolean logout = Boolean.parseBoolean(req.getParameter("logout"));
        if (userId != null) {
            userService.findUserById(Long.parseLong(userId), req, resp);
        } else {
            if (logout){
                req.getSession().invalidate();
            }
            getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        userService.saveUserById(req);
        resp.sendRedirect("/quest");
    }
}