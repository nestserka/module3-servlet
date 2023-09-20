package com.module3.project3.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "semiResultServlet", value = "/semiResult-servlet")
public class SemiResult extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String qs6 = req.getParameter("qs6");
            if(qs6.equals("uncertain")){
                req.setAttribute("resultVal", qs6);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/result.jsp");
                requestDispatcher.forward(req, resp);
            } else if (qs6.equals("no")){
                req.setAttribute("resultVal", qs6);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/result.jsp");
                requestDispatcher.forward(req, resp);
            }
        }

}

