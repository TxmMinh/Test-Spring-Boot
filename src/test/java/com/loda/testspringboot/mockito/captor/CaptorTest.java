package com.loda.testspringboot.mockito.captor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CaptorTest {
    @Mock
    List<Object> list;

    @Captor
    ArgumentCaptor<Object> captor;

    @Test
    public void testCaptor1() {
        list.add(1);
        // Capture lần gọi add vừa rồi có giá trị là gì
        Mockito.verify(list).add(captor.capture());

        System.out.println(captor.getAllValues());

        assertEquals(1, captor.getValue());
    }
}
