package com.module3.project3.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Timestamp;

@WebServlet(name = "initServlet", value = "/start")
public class InitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        String api =  req.getRemoteAddr();
        session.setAttribute("ipAddress", api);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        session.setAttribute("gameTime",timestamp.getTime());
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
