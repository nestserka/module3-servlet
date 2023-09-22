package com.module3.project3.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Quest {
    private int id;
    private String questName;
    private String description;
    private List <QuestQuestions> questions;
}
