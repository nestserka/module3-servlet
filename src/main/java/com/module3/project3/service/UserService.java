package com.module3.project3.service;

import com.module3.project3.entity.User;
import com.module3.project3.repository.UserRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class UserService {

    UserRepository userRepository = new UserRepository();

    public User saveUserById(HttpServletRequest req){
        return userRepository.saveUserById(req);
    }

    public void findUserById(Long userId,HttpServletRequest req,  HttpServletResponse resp) throws ServletException, IOException {
        User user =  userRepository.findUserById(userId, req);
        if (user != null) {
            req.setAttribute("user", user);
            req.getRequestDispatcher("/WEB-INF/userInfo.jsp").forward(req, resp);
        }
    }
}