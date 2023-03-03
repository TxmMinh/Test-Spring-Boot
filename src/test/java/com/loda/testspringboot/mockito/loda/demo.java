package com.loda.testspringboot.mockito.loda;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class demo {

    // Mockito
    // Tạo đối tượng bị Mock
    // Cách 1: Sử dụng Mockito.mock()
    @Test
    public void testUserMockFunction() {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.size()).thenReturn(2);
        assertEquals(2, mockList.size());
    }

}
