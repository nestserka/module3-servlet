package com.module3.project3.controller;

import com.module3.project3.entity.JsonParser;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Properties;

@WebServlet(name = "initServlet", value = "/start")
public class InitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
//        ** parse was called in order to create the json file for the quest
//        JsonParser ps = new JsonParser();
//        ps.createJsonFile();
        String api =  req.getRemoteAddr();
        session.setAttribute("ipAddress", api);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        session.setAttribute("gameTime",timestamp.getTime());
        getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
    }
}
