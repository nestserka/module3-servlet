package com.module3.project3.repository;

import com.module3.project3.entity.User;
import com.module3.project3.enams.UserRole;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import com.google.gson.Gson;


import java.util.Random;

public class UserRepository {
    private Gson gson = new Gson();

    public User saveUserById(HttpServletRequest req){
        String api =  req.getRemoteAddr();
        User user = new User();
        user.setNickname(req.getParameter("email"));
        user.setEmail(req.getParameter("nickName"));
        user.setRole(UserRole.valueOf(req.getParameter("role")));
        user.setId(genereteUserId());
        user.setIpAddress(api);
        String userJson = gson.toJson(user);
        saveUserToSession(req, userJson);
        return user;

    }

    public void saveUserToSession(HttpServletRequest req, String userJson){
        HttpSession session = req.getSession(true);
        session.setAttribute("user", userJson);
    }

    private long genereteUserId(){
        Random random = new Random();
        long randomUserId = random.nextLong();
            if (randomUserId < 0) {
            randomUserId = -randomUserId;
            }
        return randomUserId;
    }

}
