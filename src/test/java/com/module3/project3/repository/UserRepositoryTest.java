package com.module3.project3.repository;

import com.google.gson.Gson;
import com.module3.project3.enams.UserRole;
import com.module3.project3.entity.User;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import jakarta.servlet.http.HttpServletRequest;
public class UserRepositoryTest {

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpSession session;

    private UserRepository userRepository;

    private Gson gson = new Gson();

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        userRepository = new UserRepository();
    }

    @Test
    public void testSavingUserById() {
        when(request.getParameter("nickname")).thenReturn("John");
        when(request.getParameter("email")).thenReturn("john@example.com");
        when(request.getParameter("role")).thenReturn("PLAYER");
        when(request.getSession(true)).thenReturn(session);
        User savedUser = userRepository.saveUserById(request);
        verify(session).setAttribute("user", gson.toJson(savedUser));

        assertEquals("John", savedUser.getNickname());
        assertEquals("john@example.com", savedUser.getEmail());
        assertEquals(UserRole.PLAYER, savedUser.getRole());
    }

    @Test
    public void testGeneratingUserId() {
        long userId = userRepository.genereteUserId();
        assertTrue(userId >= 0, "User ID should be non-negative");
        assertTrue(userId <= Long.MAX_VALUE, "User ID should be within the allowed range");
    }
}