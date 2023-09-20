package com.module3.project3.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "questServlet", value = "/quest-servlet")
public class QuestServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/room.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("action").equals("qs1")) {
            updateFirstQsForm(req,resp);
        } else {
            updateSecondQsForm(req,resp);
        }
    }

    private void updateFirstQsForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        String place = req.getParameter("place");
        session.setAttribute("place", place);
        session.setAttribute("ipAddress", req.getRemoteAddr());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/bridge.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void updateSecondQsForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String q2 = req.getParameter("qs2");
        RequestDispatcher requestDispatcher;

        if (q2.equals("lie")) {
            requestDispatcher = req.getRequestDispatcher("WEB-INF/q2_feedback.jsp");
        } else {
            requestDispatcher = req.getRequestDispatcher("WEB-INF/game_over.jsp");
        }

        requestDispatcher.forward(req, resp);
    }
}