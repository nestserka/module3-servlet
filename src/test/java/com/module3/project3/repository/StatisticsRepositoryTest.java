package com.module3.project3.repository;

import com.module3.project3.entity.Statistics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
public class StatisticsRepositoryTest {

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpSession session;

    private StatisticsRepository statisticsRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        statisticsRepository = new StatisticsRepository();
    }

    @Test
    public void Should_Match_Expected_Values_When_All_Fields_Are_Populated() {
        when(request.getSession(false)).thenReturn(session);
        when(session.getAttribute("winCount")).thenReturn(5);
        when(session.getAttribute("gameTime")).thenReturn(System.currentTimeMillis() - 60000);

        Statistics result = statisticsRepository.findUserGameData(request);

        assertEquals("01:00", result.getGameTime());
        assertEquals(5, result.getWinCount());
    }
}
