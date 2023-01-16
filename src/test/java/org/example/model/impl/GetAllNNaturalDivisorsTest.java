package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetAllNNaturalDivisorsTest {
    private final Service service = new ServiceImpl();

    @Test
    void naturalDividors() throws NegativeException, ValueCommandDataException {
        int a = 130;

        int[] expectedResult= service.getAllNNaturalDividors(a);

        assertArrayEquals(new int[]{1, 2, 5, 10, 13, 26, 65, 130}, expectedResult);

        a = 230;

        expectedResult= service.getAllNNaturalDividors(a);

        assertArrayEquals(new int[]{1, 2, 5, 10, 23, 46,  115,  230}, expectedResult);
    }

    @Test
    void throwExceptionIfValueZero(){
        int a = 0;

        assertThrows(ValueCommandDataException.class, () -> service.getAllNNaturalDividors(a));
    }

    @Test
    void throwExceptionIfValueLessZero(){
        int a = -123;

        assertThrows(NegativeException.class, () -> service.getAllNNaturalDividors(a));
    }
}
