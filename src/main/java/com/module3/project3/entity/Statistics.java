package com.module3.project3.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statistics {
    private String ipAddress;
    private String place;
    private String direction;
    private String item;
    private String gameTime;


    public Statistics(String ipAddress, String place, String direction, String item, String gameTime) {
        this.ipAddress = ipAddress;
        this.place = place;
        this.direction = direction;
        this.item = item;
        this.gameTime = gameTime;
    }
}
