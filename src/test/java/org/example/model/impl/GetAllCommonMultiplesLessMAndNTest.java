package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetAllCommonMultiplesLessMAndNTest {
    private final Service service = new ServiceImpl();

    @Test
    void allCommonMultiplesLessMAndNTest() throws NegativeException, ValueCommandDataException {
        int a = 160;
        int b = 250;

        int[] expectedResult= service.getAllCommonMultiplesLessMAndN(a, b);

        assertArrayEquals(new int[]{4000, 8000, 12000, 16000, 20000, 24000, 28000, 32000, 36000}, expectedResult);

        a = 50;
        b = 60;

        expectedResult= service.getAllCommonMultiplesLessMAndN(a, b);

        assertArrayEquals(new int[]{300, 600, 900, 1200, 1500, 1800, 2100, 2400, 2700}, expectedResult);

        a = 5;
        b = 6;

        expectedResult= service.getAllCommonMultiplesLessMAndN(a, b);

        assertArrayEquals(new int[]{}, expectedResult);
    }

    @Test
    void throwExceptionIfValuesZero(){
        int a = 0;
        int b = 50;

        int finalB = b;
        int finalA = a;

        assertThrows(ValueCommandDataException.class, () -> service.getAllCommonMultiplesLessMAndN(finalA, finalB));

        a = 150;
        b = 0;

        int finalA1 = a;
        int finalB1 = b;

        assertThrows(ValueCommandDataException.class, () -> service.getAllCommonMultiplesLessMAndN(finalA1, finalB1));

    }

    @Test
    void throwExceptionIfValueLessZero(){
        int a = -123;
        int b = 130;

        int finalA = a;
        int finalB = b;

        assertThrows(NegativeException.class, () -> service.getAllCommonMultiplesLessMAndN(finalA, finalB));

        a = 130;
        b = -123;

        int finalA1 = a;
        int finalB1 = b;

        assertThrows(NegativeException.class, () -> service.getAllCommonMultiplesLessMAndN(finalA1, finalB1));
    }
}
