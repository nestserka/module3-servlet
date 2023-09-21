package com.module3.project3.controller;

import com.module3.project3.entity.Statistics;
import com.module3.project3.service.StatisticsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Timestamp;

@WebServlet(name = "statisticsServlet", value = "/statistics")
public class StatisticsServlet extends HttpServlet {

    StatisticsService statService = new StatisticsService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Statistics statistics = statService.findUserData(req);
        req.setAttribute("stat", statistics);
        req.getRequestDispatcher("WEB-INF/statistics.jsp").forward(req, resp);
    }



}
