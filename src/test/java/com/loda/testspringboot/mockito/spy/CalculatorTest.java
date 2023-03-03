package com.loda.testspringboot.mockito.spy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Calculator spy = Mockito.spy(calculator);

        // Gọi phương thức add() trên đối tượng spy
        int result = spy.add(2, 3);

        // Kiểm tra phương thức add() được gọi đúng cách
        Mockito.verify(spy).add(2, 3);
        assertEquals(5, result);

        // Vẫn có thể làm giả thông tin gọi hàm với @Spy
        Mockito.when(spy.add(2,5)).thenReturn(100);
        assertEquals(100, spy.add(2,5));
    }
}
