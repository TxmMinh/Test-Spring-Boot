package com.loda.testspringboot.mockito;
import com.loda.testspringboot.mockito.dao.UserDao;
import com.loda.testspringboot.mockito.service.UserService;
import com.loda.testspringboot.mockito.service.UserServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

// @ExtendWith attaches a runner with the test class to initialize the mock data
@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
    // Create a mock object
    @Mock
    private UserDao userDao;
    private UserService userService;
    @BeforeEach
    public void setUp() {
        userService = new UserServiceImpl(userDao);
    }
    @Test
    public void createUser_WhenEmailExisted_ReturnFailed() {
        // Define return value for method createUser()
        Mockito.when(userDao.createUser("existed@gpcoder.com")).thenReturn(false);
        // Use mock in test
        assertEquals("FAILED", userService.createUser("existed@gpcoder.com"));
    }
    @Test
    public void createUser_WhenEmailNotExisted_ReturnSuccess() {
        // Define return value for method createUser()
        Mockito.when(userDao.createUser("not_existed@gpcoder.com")).thenReturn(true);
        // Use mock in test
        assertEquals("SUCCESS", userService.createUser("not_existed@gpcoder.com"));
    }
}