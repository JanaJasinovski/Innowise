package org.example.model.impl;

import org.example.exception.InCorrectParameterException;
import org.example.exception.NegativeException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayContainingBFromADoubleTest {
    private final Service service = new ServiceImpl();

    @Test
    void numberABTest() throws InCorrectParameterException, NegativeException {
        double a = 123.4566;
        int b = 3;

        int[] expectedResult = service.arrayContainingBFromADouble(a, b);

        assertArrayEquals(new int[]{4, 5, 6}, expectedResult);
    }

    @Test
    void throwExceptionIfFirstNumberDigitsLessAsSecondTest() {
        double a = 12.3;
        int b = 4;

        assertThrows(InCorrectParameterException.class, () -> service.arrayContainingBFromADouble(a, b));
    }

    @Test
    void returnAFractionalIfBIsZeroTest() throws NegativeException {
        double a = 12.345;
        int b = 0;

        int[] expectedResult = service.arrayContainingBFromADouble(a, b);

        assertArrayEquals(new int[]{3, 4, 5}, expectedResult);
    }

    @Test
    void throwExceptionIfNumbersIsNegativeTest() {
        double a = -12.345;
        int b = 3;

        assertThrows(NegativeException.class, () -> service.arrayContainingBFromADouble(a, b));
    }
}
