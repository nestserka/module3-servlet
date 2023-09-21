package com.module3.project3.service;

import com.module3.project3.entity.Statistics;
import com.module3.project3.repository.StatisticsRepository;
import jakarta.servlet.http.HttpServletRequest;


public class StatisticsService {

    StatisticsRepository statRepository = new StatisticsRepository();

    public Statistics findUserData(HttpServletRequest req){
        return statRepository.findUserData(req);
    }
}
