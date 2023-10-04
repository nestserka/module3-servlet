package com.module3.project3.controller;

import com.module3.project3.service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.mockito.Mockito.*;

public class InitServletTest {

    @Mock
    private UserService userService;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    private InitServlet initServlet;

    @Mock
    private ServletContext servletContext;
    @Mock
    private HttpSession session;

    @Mock
    private RequestDispatcher requestDispatcher;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        initServlet = new InitServlet();
        initServlet.userService = userService;
    }

    @Test
    public void testDoPost() throws Exception {
        initServlet.doPost(request, response);
        verify(userService, times(1)).saveUserById(request);
        verify(response).sendRedirect("/quest");
    }
}
