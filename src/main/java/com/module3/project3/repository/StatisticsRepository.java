package com.module3.project3.repository;

import com.module3.project3.entity.Statistics;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.sql.Timestamp;

public class StatisticsRepository {

    public Statistics findUserGameData(HttpServletRequest req){
        HttpSession session = req.getSession(false);
        Integer winCount = (Integer) session.getAttribute("winCount");
        Long gameTime = (Long) session.getAttribute("gameTime");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long differenceInMillis = timestamp.getTime() - gameTime;
        long minutes = (differenceInMillis / (1000 * 60)) % 60;
        long seconds = (differenceInMillis / 1000) % 60;
        String formattedTime = String.format("%02d:%02d", minutes, seconds);
        Statistics stats = new Statistics(formattedTime, winCount);
        return stats;
    }
}

