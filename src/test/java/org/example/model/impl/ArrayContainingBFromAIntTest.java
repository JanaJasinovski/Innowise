package org.example.model.impl;

import org.example.exception.InCorrectParameterException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayContainingBFromAIntTest {
    private final Service service = new ServiceImpl();

    @Test
    void numberABTest() throws InCorrectParameterException {
        int a = 1234566;
        int b = 3;

        int[] expectedResult = service.arrayContainingBFromAInt(a, b);

        assertArrayEquals(new int[]{1, 2, 3}, expectedResult);
    }

    @Test
    void throwExceptionIfFirstNumberLessAsSecondTest() {
        int a = 123;
        int b = 4;

        assertThrows(InCorrectParameterException.class, () -> service.arrayContainingBFromAInt(a, b));
    }

    @Test
    void returnAIfBIsZeroTest() {
        int a = 12345;
        int b = 0;

        int[] expectedResult = service.arrayContainingBFromAInt(a, b);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, expectedResult);
    }

    @Test
    void throwExceptionIfNumbersIsNegativeTest() {
        int a = -12345;
        int b = 3;

        assertThrows(InCorrectParameterException.class, () -> service.arrayContainingBFromAInt(a, b));
    }
}

