package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetNMCommonDivisorsTest {
    private final Service service = new ServiceImpl();
    @Test
    void commonNaturalDividors() throws NegativeException, ValueCommandDataException {
        int a = 10;
        int b = 55;

        int[] expectedResult= service.getNMCommonDivisors(a, b);

        assertArrayEquals(new int[]{1, 5}, expectedResult);

        a = 230;
        b = 160;

        expectedResult= service.getNMCommonDivisors(a, b);

        assertArrayEquals(new int[]{1, 2, 5, 10}, expectedResult);
    }

    @Test
    void throwExceptionIfValuesZero(){
        int a = 0;
        int b = 50;

        int finalB = b;
        int finalA = a;
        assertThrows(ValueCommandDataException.class, () -> service.getNMCommonDivisors(finalA, finalB));

        a = 150;
        b = 0;

        int finalA1 = a;
        int finalB1 = b;
        assertThrows(ValueCommandDataException.class, () -> service.getNMCommonDivisors(finalA1, finalB1));

    }

    @Test
    void throwExceptionIfValueLessZero(){
        int a = -123;
        int b = 130;

        int finalA = a;
        int finalB = b;
        assertThrows(NegativeException.class, () -> service.getNMCommonDivisors(finalA, finalB));

        a = 130;
        b = -123;

        int finalA1 = a;
        int finalB1 = b;
        assertThrows(NegativeException.class, () -> service.getNMCommonDivisors(finalA1, finalB1));
    }

}
