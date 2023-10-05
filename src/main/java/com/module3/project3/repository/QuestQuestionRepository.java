package com.module3.project3.repository;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.module3.project3.enams.AnswersType;
import com.module3.project3.entity.QuestQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class QuestQuestionRepository {

    private Gson gson = new Gson();

    public List<QuestQuestions> fetchListOfQuestions(int id) {
        if (id < 0) {
            throw new IllegalArgumentException();
        }
        List<QuestQuestions> questionsList = new ArrayList<>();
        try {
            URL resourceUrl = getClass().getClassLoader().getResource("memory_game.json");
            if (resourceUrl != null) {
                String filePath = resourceUrl.getPath();
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    JsonObject rootObject = gson.fromJson(reader, JsonObject.class);
                    JsonArray questsArray = rootObject.getAsJsonArray("quest");

                    for (JsonElement questElement : questsArray) {
                        JsonObject questObject = questElement.getAsJsonObject();
                        int questId = questObject.get("id").getAsInt();

                        if (questId == id) {
                            JsonArray questionsArray = questObject.getAsJsonArray("questions");
                            for (JsonElement questionElement : questionsArray) {
                                JsonObject questionObject = questionElement.getAsJsonObject();
                                String qsNo = questionObject.get("qsNo").getAsString();
                                String qsType = questionObject.get("qsType").getAsString();
                                String qsDescription = questionObject.get("qsDescription").getAsString();
                                String qsAnswersJson = questionObject.get("qsAnswers").getAsString();
                                List<AnswersType> answersTypeList = new ArrayList<>();

                                if (qsAnswersJson != null && !qsType.equals("result")) {
                                    AnswersType[] answers = gson.fromJson(qsAnswersJson, AnswersType[].class);
                                    for (AnswersType answer : answers) {
                                        if (answer != null) {
                                            answersTypeList.add(answer);
                                        }
                                    }
                                }
                                QuestQuestions question = new QuestQuestions();
                                question.setQsNo(qsNo);
                                question.setQsType(qsType);
                                question.setQsDescription(qsDescription);
                                if (!answersTypeList.isEmpty()) {
                                    question.setAnswersType(answersTypeList);
                                }
                                questionsList.add(question);
                            }

                            break;
                        }
                    }
                }
            } else {
                System.out.println("Resource not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questionsList;
    }
}
