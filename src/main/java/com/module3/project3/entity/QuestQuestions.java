package com.module3.project3.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuestQuestions {
    private String qsNo;
    private String qsDescription;
    private List<String> qsAnswers;
}
