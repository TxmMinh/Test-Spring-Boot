package com.loda.testspringboot.mockito.loda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Cách 2: Sử dụng @Mock, tuy nhiên cần kích hoạt Mockito để nó mock các object
// Sau khi kích hoạt thì các Object được gắn @Mock sẽ trở thành 1 Object giả mạo và đã được khởi tạo (tức là != null)
// --Cách 1
@ExtendWith(MockitoExtension.class) // kích hoạt @Mock
public class MockitoAnnotationTest {
    @Mock
    List<String> mockedList;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testLengthOfString() {
        Mockito.when(mockedList.size()).thenReturn(2);
        assertEquals(2, mockedList.size());
    }
}
