package com.module3.project3.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class QuestQuestionsServiceTest {

    private QuestQuestionsService questQuestionsService;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpSession session;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        questQuestionsService = new QuestQuestionsService();
    }

    @Test
    public void IfSession_Null_ThrowNullException() {
        when(request.getSession(false)).thenReturn(null);

        assertThrows(NullPointerException.class, () -> {
            questQuestionsService.checkWins("4", request);
        });
    }
}
