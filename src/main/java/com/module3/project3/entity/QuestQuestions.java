package com.module3.project3.entity;

import com.module3.project3.enams.AnswersType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class QuestQuestions {
    private String qsNo;
    private String qsType;
    private String qsDescription;
    private List<AnswersType> answersType;
}
