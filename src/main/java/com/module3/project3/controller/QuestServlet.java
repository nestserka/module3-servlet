package com.module3.project3.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "questServlet", value = "/quest-servlet")
public class QuestServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher( "WEB-INF/room.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        String action = req.getParameter("action");
        if (action != null) {
            switch (action) {
                case "qs1":
                    updateFirstQuestion(req, resp);
                    break;
                case"qs2":
                    updateSecondQuestion(req, resp);
                    break;
                case "qs3":
                    updateThirdQuestion(req, resp);
                    break;
                case "qs4":
                    updateForthQuestion(req,resp);
                    break;
                default:
                    updateSixthQuestion(req, resp);
                    break;
            }
        }
    }

    private void updateFirstQuestion(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        try {
            HttpSession session = req.getSession(false);
            String place = req.getParameter("place");
            session.setAttribute("place", place);
            req.getRequestDispatcher("WEB-INF/bridge.jsp").forward(req, resp);
        } catch (Exception e) {
            throw new ServletException("User input is null or incorrect");
        }
    }

    private void  updateSecondQuestion(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        String q2 = req.getParameter("qs2");
        try {
            if (q2.equals("lie")) {
                req.getRequestDispatcher("WEB-INF/user_direction.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("WEB-INF/game_over.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            throw new ServletException("User input is null or incorrect");
        }
    }

    private void updateThirdQuestion(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        String qs3 = req.getParameter("qs3");
        try {
            if (qs3 != null && !qs3.isEmpty()) {
                HttpSession session = req.getSession(false);
                session.setAttribute("direction", qs3);
                if (qs3.equals("forest")) {
                    req.getRequestDispatcher("WEB-INF/forest.jsp").forward(req, resp);
                } else {
                    req.getRequestDispatcher("WEB-INF/town.jsp").forward(req, resp);
                }
            }
        } catch (Exception e) {
            throw new ServletException("User input is null or incorrect");
        }
    }

    private void updateForthQuestion(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        String qs4 = req.getParameter("qs4");
        try {
            if (qs4 != null && !qs4.isEmpty()) {
                HttpSession session = req.getSession(false);
                session.setAttribute("item", qs4);
                req.getRequestDispatcher("WEB-INF/riddle.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            throw new ServletException("User input is null or incorrect");
        }
    }

    private void updateSixthQuestion(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        String qs6 = req.getParameter("qs6");
        try {
            if((qs6.equals("uncertain")) || (qs6.equals("no")) || (qs6.equals("run")) || (qs6.equals("hit"))) {
                req.setAttribute("resultVal", qs6);
                req.getRequestDispatcher("WEB-INF/result.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("WEB-INF/final.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            throw new ServletException("User input is null or incorrect");
        }
    }

}


