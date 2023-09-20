package com.module3.project3.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "quizServlet", value = "/quiz-servlet")
public class QuizServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/user_direction.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(req.getParameter("action").equals("qs3")){
            String qs3 = req.getParameter("qs3");
            session.setAttribute("direction", qs3);
            redirectUserToNextRound(req, resp, qs3);
        } else {
            String qs4 = req.getParameter("qs4");
            session.setAttribute("item", qs4);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/riddle.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    private void redirectUserToNextRound(HttpServletRequest req, HttpServletResponse resp, String qs3) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        if (qs3.equals("forest")) {
            requestDispatcher = req.getRequestDispatcher("WEB-INF/forest.jsp");
        } else {
            requestDispatcher = req.getRequestDispatcher("WEB-INF/town.jsp");
        }
        requestDispatcher.forward(req, resp);
    }
}
