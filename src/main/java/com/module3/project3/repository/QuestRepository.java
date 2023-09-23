package com.module3.project3.repository;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.module3.project3.enams.AnswersType;
import com.module3.project3.entity.Quest;
import com.module3.project3.entity.QuestQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.*;

public class QuestRepository {

    private Gson gson = new Gson();
    private Quest quest = new Quest();

    public List<Quest> createNewQuests() {
        List<Quest> questList = new ArrayList<>();
        Quest quest = new Quest();
        quest.setId(1);
        quest.setQuestName("The Quest of Forgotten Memories");
        quest.setDescription("Welcome to \"The Quest of Forgotten Memories\". In this adventure, you wake up with no recollection of your past.\n" +
                "As you explore this enigmatic world, you'll face challenges, solve riddles, and make decisions that\n" +
                "shape your quest to recover your lost memories. Are you ready to begin your journey and uncover the secrets within?");
        List<QuestQuestions> questionsList = new ArrayList<>();
        QuestQuestions question1 = new QuestQuestions();
        question1.setQsNo("Q-1");
        question1.setQsType("input");
        question1.setQsDescription("You awaken disoriented and with no memory of who you are or how you got here. As your eyes adjust to the faint light, you notice an open journal on the table beside you. Where did you wake up with no memory?");
        question1.setAnswersType(Collections.singletonList(AnswersType.QS_1));
        QuestQuestions question2 = new QuestQuestions();
        question2.setQsNo("Q-2");
        question2.setQsType("radio");
        question2.setQsDescription("You left and arrived at a bridge, where the officer asks for your name. Will you:");
        List<AnswersType> answerTypes2 = new ArrayList<>();
        answerTypes2.addAll(Arrays.asList(AnswersType.QS_2, AnswersType.QS_2_FALSE));
        question2.setAnswersType(answerTypes2);
        QuestQuestions question3 = new QuestQuestions();
        question3.setQsNo("Q-3");
        question3.setQsType("radio");
        question3.setQsDescription("Contemplating a deceptive response, you briefly consider providing a false name. Eventually, you decide to fabricate an identity, and the officer, unaware of the ruse, permits you to proceed.\n" +
                "You venture into the dark forest, hoping to find clues about your past. You stumble upon an old journal with your name in it, providing some hints about your identity. Under the stone you found");
        List<AnswersType> answerTypes3 = new ArrayList<>();
        answerTypes3.addAll(Arrays.asList(AnswersType.QS_3_1, AnswersType.QS_3_2, AnswersType.QS_3_3));
        question3.setAnswersType(answerTypes3);

        QuestQuestions question4 = new QuestQuestions();
        question4.setQsNo("Q-4");
        question4.setQsType("radio");
        question4.setQsDescription("You continue your journey. In the heart of the forest, you find a magical pool with a mermaid-like creature. She beckons you closer and poses her riddle: \"I'm always hungry, I must always be fed. The finger I touch will soon turn red. What am I?");
        List<AnswersType> answerTypes4 = new ArrayList<>();
        answerTypes4.addAll(Arrays.asList(AnswersType.QS_4_1, AnswersType.QS_4_2, AnswersType.QS_4_3));
        question4.setAnswersType(answerTypes4);

        QuestQuestions question5 = new QuestQuestions();
        question5.setQsNo("Q-5");
        question5.setQsType("radio");
        question5.setQsDescription("Your answer was correct. The mermaid-like creature smiles and grants you access to a hidden treasure chest. Would you take it directly from her?");
        List<AnswersType> answerTypes5 = new ArrayList<>();
        answerTypes5.addAll(Arrays.asList(AnswersType.QS_5_1, AnswersType.QS_5_2, AnswersType.QS_5_3, AnswersType.QS_5_4));
        question5.setAnswersType(answerTypes5);
        QuestQuestions question6 = new QuestQuestions();
        question6.setQsNo("R-1");
        question6.setQsType("result");
        question6.setQsDescription("Feeling a pang of uncertainty, you decide to tell the truth about your name, even though you can't quite recall it. You admit that you don't remember your name due to amnesia. The officer's expression changes from suspicion to confusion. He looks at you skeptically, unable to comprehend how someone could forget their own name.\\n\" +\n" +
                "                \"    The officer becomes convinced that you must be a suspicious character and takes you to prison.");
        QuestQuestions question7 = new QuestQuestions();
        question7.setQsNo("R-2");
        question7.setQsType("result");
        question7.setQsDescription("Wrong answer. Creature took you under water and killed. Gave over.");
        QuestQuestions question8 = new QuestQuestions();
        question8.setQsNo("R-3");
        question8.setQsType("result");
        question8.setQsDescription("Wrong answer. Way too wrong answer. Creature does not even knows what pan is. Game over.");
        QuestQuestions question9 = new QuestQuestions();
        question9.setQsNo("R-4");
        question9.setQsType("result");
        question9.setQsDescription("You choose not to take the treasure directly, acknowledging the creature's kindness. It turns out that the mermaid-like creature was not a foe but a guardian, protecting lost souls from their own greed. As a result of your compassion, you've brought safety to this enchanted place, and the creature expresses its gratitude. However: you still do not know who you are.");
        QuestQuestions question10 = new QuestQuestions();
        question10.setQsNo("R-5");
        question10.setQsType("result");
        question10.setQsDescription("You suddenly find yourself questioning the reality of the mermaid-like creature and your entire journey. Just as you say this, you wake up in a hospital bed, surrounded by medical equipment. It turns out that your entire adventure was a vivid dream. You've regained consciousness, and your memory slowly starts returning as the fog lifts.");
        QuestQuestions question11 = new QuestQuestions();
        question11.setQsNo("R-6");
        question11.setQsType("result");
        question11.setQsDescription("You decide to take the treasure directly from the creature, ignoring any potential risks. Creature took you under water. Game Over.");
        QuestQuestions question12 = new QuestQuestions();
        question12.setQsNo("R-7");
        question12.setQsType("result");
        question12.setQsDescription("Faced with the mermaid-like creature's sudden attack, you swiftly make a choice. Instead of attempting to fight the creature head-on, you choose to run. Your instincts kick in, and you dash away from the hostile creature, leaving the treasure behind. As you sprint through the forest, you realize that running from danger has become a recurring theme in your life. You are, in fact, a skilled prison breaker, always evading trouble and escaping difficult situations. This revelation brings clarity to your past.Your quest ends with a sense of familiarity and determination. You've remembered who you are—a prison breaker with a knack for escaping danger. Though your lost memory remains a mystery, you continue to embrace your identity, ready to face any challenges that may lie ahead.");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question11);
        questionsList.add(question12);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        quest.setQuestions(questionsList);
        questList.add(quest);
        return questList;
    }

    public Quest fetchQuestById(int id) {
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
                            Quest quest = new Quest();
                            quest.setId(questId);
                            quest.setQuestName(questObject.get("questName").getAsString());
                            quest.setDescription(questObject.get("description").getAsString());
                            return quest;
                        }
                    }
                }
            } else {
                System.out.println("Resource not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Quest> findListOfQuests() {
        try {
            URL resourceUrl = getClass().getClassLoader().getResource("memory_game.json");
            if (resourceUrl != null) {
                String filePath = resourceUrl.getPath();
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    JsonObject rootObject = gson.fromJson(reader, JsonObject.class);
                    JsonArray questsArray = rootObject.getAsJsonArray("quest");

                    List<Quest> quests = new ArrayList<>();
                    for (JsonElement questElement : questsArray) {
                        JsonObject questObject = questElement.getAsJsonObject();
                        Quest quest = parseQuestFromJsonObject(questObject);
                        quests.add(quest);
                    }

                    return quests;
                }
            } else {
                System.out.println("Resource not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private Quest parseQuestFromJsonObject(JsonObject questObject) {
        Quest quest = new Quest();
        quest.setId(questObject.get("id").getAsInt());
        quest.setQuestName(questObject.get("questName").getAsString());
        quest.setDescription(questObject.get("description").getAsString());
        return quest;
    }
}