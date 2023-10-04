package com.module3.project3.repository;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
        user.setNickname(req.getParameter("nickname"));
        user.setEmail(req.getParameter("email"));
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

    public long genereteUserId(){
        Random random = new Random();
        long randomUserId = random.nextLong();
        if (randomUserId < 0) {
            randomUserId = -randomUserId;
        }
        return randomUserId;
    }

    public User findUserById(long userId,HttpServletRequest req){
        HttpSession session = req.getSession(false);
        if (session != null) {
            User user = new User();
            String userJson = (String) session.getAttribute("user");
            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(userJson).getAsJsonObject();
            long id = userId;
            user.setId(id);
            user.setNickname(jsonObject.get("nickname").getAsString());
            user.setEmail((jsonObject.get("email").getAsString()));
            user.setRole(UserRole.valueOf(jsonObject.get("role").getAsString()));
            user.setIpAddress(jsonObject.get("ipAddress").getAsString());
            return user;
        }
        return null;
    }


}