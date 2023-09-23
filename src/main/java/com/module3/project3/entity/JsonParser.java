package com.module3.project3.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.net.URL;
import java.util.List;


public class JsonParser {


    public void createJsonFile(List<Quest> quests) throws JsonProcessingException {
        JSONObject outerObject = new JSONObject();
        JSONArray questsArray = new JSONArray();

        for (Quest quest : quests) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", quest.getId());
            jsonObject.put("questName", quest.getQuestName());
            jsonObject.put("description", quest.getDescription());

            JSONArray questionsArray = new JSONArray();
            for (QuestQuestions question : quest.getQuestions()) {
                JSONObject questionObject = new JSONObject();
                ObjectMapper objectMapper = new ObjectMapper();

                questionObject.put("qsNo", question.getQsNo());
                questionObject.put("qsType", question.getQsType());
                questionObject.put("qsDescription", question.getQsDescription());
                String jsonValue = objectMapper.writeValueAsString(question.getAnswersType());
                questionObject.put("qsAnswers", jsonValue);
                questionsArray.add(questionObject);
            }
            jsonObject.put("questions", questionsArray);

            questsArray.add(jsonObject);
        }

        outerObject.put("quest", questsArray);

        try {
            URL resourceUrl = this.getClass().getClassLoader().getResource("memory_game.json");
            System.out.println("test" + resourceUrl);
            if (resourceUrl != null) {
                String filePath = resourceUrl.getPath();
                FileWriter fileWriter = new FileWriter(filePath);
                fileWriter.write(outerObject.toJSONString());
                fileWriter.close();
                System.out.println("File Path: " + filePath);
            } else {
                System.out.println("Resource not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



