package com.module3.project3.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "riddleServlet", value = "/riddle-servlet")
public class RiddleServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/chest.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String qs6 = req.getParameter("qs6");
        if((qs6.equals("uncertain")) || (qs6.equals("no")) || (qs6.equals("run")) || (qs6.equals("hit"))) {
            req.setAttribute("resultVal", qs6);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/result.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/final.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}
