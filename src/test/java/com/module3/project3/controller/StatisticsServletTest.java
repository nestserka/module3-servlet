package com.module3.project3.controller;

import com.module3.project3.entity.Statistics;
import com.module3.project3.service.StatisticsService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class StatisticsServletTest {
    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private RequestDispatcher requestDispatcher;

    @Mock
    private StatisticsService statService;

    private StatisticsServlet statisticsServlet;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        statisticsServlet = new StatisticsServlet();
        statisticsServlet.statService = statService;
    }

    @Test
    public void Should_Set_StatisticsAttribute_And_Forward_To_StatisticsJSP() throws Exception {
        Statistics mockStatistics = new Statistics("00:13", 0);
        when(statService.findUserData(request)).thenReturn(mockStatistics);
        when(request.getRequestDispatcher("WEB-INF/statistics.jsp")).thenReturn(requestDispatcher);
        statisticsServlet.doGet(request, response);

        verify(statService).findUserData(request);
        verify(request).setAttribute("stat", mockStatistics);
        verify(request).getRequestDispatcher("WEB-INF/statistics.jsp");
        verify(requestDispatcher).forward(request, response);
    }
}
