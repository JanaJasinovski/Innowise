package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAllNaturalNumbersABExpressionTest {
    private final Service service = new ServiceImpl();

    @Test
    void findAllNaturalNumbersABExpressionTest() throws NegativeException, ValueCommandDataException {
        int n = 35;

        int[] expectedResult = service.findAllNaturalNumbersABExpression(n);

        assertArrayEquals(new int[]{10, 1}, expectedResult);

        n = 5000;

        expectedResult = service.findAllNaturalNumbersABExpression(n);

        assertArrayEquals(new int[]{1665, 1}, expectedResult);
    }

    @Test
    void returnAIfBIsZeroTest() {
        int n = 0;

        assertThrows(ValueCommandDataException.class, () -> service.findAllNaturalNumbersABExpression(n));
    }

    @Test
    void throwExceptionIfNumbersIsNegativeTest() {
        int n = -12345;

        assertThrows(NegativeException.class, () -> service.findAllNaturalNumbersABExpression(n));
    }
}
