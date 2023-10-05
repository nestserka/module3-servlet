package com.module3.project3.repository;

import com.module3.project3.enams.AnswersType;
import com.module3.project3.entity.QuestQuestions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuestQuestionRepositoryTest {
    private QuestQuestionRepository questQuestionRepository = new QuestQuestionRepository();

    @Test
    public void Validate_ListOfQuestions_By_QuestId() {
        int questId = 1;
        List<QuestQuestions> questionsList = questQuestionRepository.fetchListOfQuestions(questId);
        assertEquals(12, questionsList.size());
        QuestQuestions question1 = questionsList.get(0);
        assertEquals("Q-1", question1.getQsNo());
        assertEquals("input", question1.getQsType());
        assertEquals("You awaken disoriented and with no memory of who you are or how you got here. As your eyes adjust to the faint light, you notice an open journal on the table beside you. Where did you wake up with no memory?", question1.getQsDescription());
        List<AnswersType> answersTypeList1 = question1.getAnswersType();
        assertEquals(1, answersTypeList1.size());

        QuestQuestions question2 = questionsList.get(1);
        assertEquals("Q-2", question2.getQsNo());
        assertEquals("radio", question2.getQsType());
        assertEquals("You left and arrived at a bridge, where the officer asks for your name. Will you:", question2.getQsDescription());
        List<AnswersType> answersTypeList2 = question2.getAnswersType();
        assertEquals(2, answersTypeList2.size());
    }

    @Test
    public void When_QuestId_IsInvalid_ThrowException(){
        int invalidQuestId = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            questQuestionRepository.fetchListOfQuestions(invalidQuestId);
        });
    }
}