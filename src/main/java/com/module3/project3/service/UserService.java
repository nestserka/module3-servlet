package com.module3.project3.service;

import com.module3.project3.entity.User;
import com.module3.project3.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;


public class UserService {

    UserRepository userRepository = new UserRepository();

    public User saveUserById(HttpServletRequest req){
        return userRepository.saveUserById(req);
    }
}
