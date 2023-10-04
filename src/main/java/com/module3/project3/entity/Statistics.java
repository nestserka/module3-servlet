package com.module3.project3.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statistics {
    private String gameTime;
    private Integer winCount;

    public Statistics(String gameTime, Integer winCount) {
        this.gameTime = gameTime;
        this.winCount = winCount;
    }
}