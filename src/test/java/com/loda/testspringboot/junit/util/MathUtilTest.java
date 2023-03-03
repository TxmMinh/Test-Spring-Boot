package com.loda.testspringboot.junit.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {
    @Test
    public void divide_SixDividedByTwo_ReturnThree() {
        final int expected = 3;

        final int actual = MathUtil.divide(6, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void divide_OneDividedByTwo_ReturnZero() {
        final int expected = 0;

        final int actual = MathUtil.divide(1, 2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide_OneDividedByZero_ThrowsIllegalArgumentException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> MathUtil.divide(1, 0));

        assertEquals("Cannot divide by zero (0).", exception.getMessage());
        // assertTrue(exception.getMessage().contains("zero"));

    }

    @Test
    public void add_SixAddedByTwo_ReturnEight() {
        final int expected = 8;

        final int actual = MathUtil.add(6, 2);

        assertEquals(expected, actual);
    }
}
