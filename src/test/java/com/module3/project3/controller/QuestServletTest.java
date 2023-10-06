package com.module3.project3.controller;

import com.module3.project3.service.QuestQuestionsService;
import com.module3.project3.service.QuestService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class QuestServletTest {
    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private HttpSession session;

    private QuestServlet questServlet;

    @Mock
    private QuestService questService;

    @Mock
    private QuestQuestionsService questQuestionsService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        questServlet = new QuestServlet();
        questServlet.questService = questService;
        questServlet.questQuestionsService = questQuestionsService;
    }

    @Test
    public void Should_Redirect_To_ListOfQuests_ifUserExist() throws Exception {
        when(request.getSession(false)).thenReturn(session);
        when(session.getAttribute("user")).thenReturn("{\"id\": 123}");
        questServlet.doGet(request, response);

        verify(request).setAttribute("userId", 123L);
        verify(questService).findListOfQuests(request, response);
    }

    @Test
    public void Validate_QuestData_With_Parameters() throws Exception {
        when(request.getSession(false)).thenReturn(session);

//        **Full User model was not used but just simplified for testing purposes
        when(session.getAttribute("user")).thenReturn("{\"id\": 123}");
        when(request.getParameter("id")).thenReturn("1");
        when(request.getParameter("qs")).thenReturn("Q-2");

        questServlet.doGet(request, response);
        verify(request).setAttribute("userId", 123L);
        verify(questQuestionsService).findQuestData(request, response, "1", "Q-2");
    }

    @Test
    public void Should_Redirect_To_NewQuestion_When_AnswerParamsAreGiven() throws Exception {
        when(request.getRequestURL()).thenReturn(new StringBuffer("http://localhost:8080/quest"));
        when(request.getParameter("qs")).thenReturn("Q-2");
        when(request.getParameter("id")).thenReturn("1");
        when(request.getParameter("place")).thenReturn("seaside");
        questServlet.doPost(request, response);
        verify(response).sendRedirect("http://localhost:8080/quest?id=1&qs=Q-2");
    }


}
