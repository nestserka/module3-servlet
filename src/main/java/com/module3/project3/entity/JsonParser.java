package com.module3.project3.entity;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class JsonParser {


    public void createJsonFile() {


        Quest quest = new Quest();
        quest.setId(1);
        quest.setQuestName("The Quest of Forgotten Memories");
        quest.setDescription("Welcome to \"The Quest of Forgotten Memories\" In this adventure, you wake up with no recollection of your past.\n" +
                "As you explore this enigmatic world, you'll face challenges, solve riddles, and make decisions that\n" +
                "shape your quest to recover your lost memories. Are you ready to begin your journey and uncover the secrets within?");
        List<QuestQuestions> questionsList = new ArrayList<>();
        QuestQuestions question1 = new QuestQuestions();
        question1.setQsNo("1");
        question1.setQsDescription("You awaken disoriented and with no memory of who you are or how you got here. As your eyes adjust to the faint light, you notice an open journal on the table beside you. Where did you wake up with no memory?");
        QuestQuestions question2 = new QuestQuestions();
        question2.setQsNo("2");
        question2.setQsDescription("You left and arrived at a bridge, where the officer asks for your name. Will you:");
        String answer2[] = new String[]{"Lie", "Tell the truth"};
        List<String> answers = Arrays.asList(answer2);
        question2.setQsAnswers(answers);


        QuestQuestions question3 = new QuestQuestions();
        question3.setQsNo("3");
        question3.setQsDescription("Contemplating a deceptive response, you briefly consider providing a false name. Eventually, you decide to fabricate an identity, and the officer, unaware of the ruse, permits you to proceed.\n" +
                "    You venture into the dark forest, hoping to find clues about your past. You stumble upon an old journal with your name in it, providing some hints about your identity. Under the stone you found");
        String answer3[] = new String[]{"Wolf necklace", "Old computer", "Suitcase with money"};
        List<String> answers3 = Arrays.asList(answer3);
        question3.setQsAnswers(answers3);

        QuestQuestions question4 = new QuestQuestions();
        question4.setQsNo("4");
        question4.setQsDescription("You continue your journey. In the heart of the forest, you find a magical pool with a mermaid-like creature. She beckons you closer and poses her riddle: \"I'm always hungry, I must always be fed. The finger I touch will soon turn red. What am I?");
        String answer4[] = new String[]{"Sun", "Fire", "Red pen"};
        List<String> answers4 = Arrays.asList(answer4);
        question4.setQsAnswers(answers4);

        QuestQuestions question5 = new QuestQuestions();
        question5.setQsNo("5");
        question5.setQsDescription("Your answer was correct. The mermaid-like creature smiles and grants you access to a hidden treasure chest. Would you take it directly from her?");
        String answer5[] = new String[]{"No, you won't take the treasure directly; you acknowledge the creature's kindness.", "Yes, you decide to take the treasure directly from the creature.", "What mermaid? Am I still sleeping?"};
        List<String> answers5 = Arrays.asList(answer5);
        question5.setQsAnswers(answers5);
        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        quest.setQuestions(questionsList);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", quest.getId());
        jsonObject.put("questName", quest.getQuestName());
        jsonObject.put("description", quest.getDescription());


        JSONArray arr = new JSONArray();
        for (QuestQuestions question : quest.getQuestions()) {
            JSONObject questionObject = new JSONObject();
            questionObject.put("qsNo", question.getQsNo());
            questionObject.put("qsDescription", question.getQsDescription());
            questionObject.put("qsAnswers", question.getQsAnswers());
            arr.add(questionObject);

        }

        jsonObject.put("questions", arr);
//            try {
//                FileWriter fileWriter = new FileWriter(jsonFilePath);
//                fileWriter.write(jsonObject.toJSONString());
//                fileWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println("JSON file created: " + jsonObject);
        }
}



