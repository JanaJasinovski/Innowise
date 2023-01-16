package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAllNumbersNotExceedingNTest {
    private final Service service = new ServiceImpl();

    @Test
    void allCommonMultiplesLessMAndNTest() throws NegativeException, ValueCommandDataException {
        int a = 160;

        int[] expectedResult= service.findAllNumbersNotExceedingN(a);

        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
        79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157}, expectedResult);

        a = 50;

        expectedResult= service.findAllNumbersNotExceedingN(a);

        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47}, expectedResult);
    }

    @Test
    void throwExceptionIfValuesZero(){
        int a = 0;

        assertThrows(ValueCommandDataException.class, () -> service.findAllNumbersNotExceedingN(a));
    }

    @Test
    void throwExceptionIfValueLessZero(){
        int a = -123;

        assertThrows(NegativeException.class, () -> service.findAllNumbersNotExceedingN(a));
    }
}
