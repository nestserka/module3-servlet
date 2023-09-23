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
    QuestService questService = new QuestService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ** parse was called in order to create the json file for the quests
//        questService.createQuestList();
        getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        userService.saveUserById(req);
        resp.sendRedirect("/quest");
    }




//        // ЗАПИСАЛИ НОВЫЕ ДАННЫЕ В БАЗУ ДАННЫХ
//        userService.updateUserById(id, newLogin, newPassword);
//
//        // ВЫВЕДЕМ И НА КОНСОЛЬ
//        System.out.println(userService.getUserById(id));
//
//        // ИДЕМ ОПЯТЬ НА ТУ ЖЕ СТРАНИЦУ И УВИДИМ НА СТРАНИЦЕ ИЗМЕНЕНИЯ
//        User userById = userService.getUserById(id);
//        request.setAttribute("user", userById);
//
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/user.jsp");
//        requestDispatcher.forward(request, response);

    }
