package org.example.model.impl;

import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfPrimeNumbersTest {
    private final Service service = new ServiceImpl();

    @Test
    void sumOfPrimeNumbersTest() throws ValueCommandDataException {
        int n = 5;
        int[] mas = new int[n];
        mas[0] = 11;
        mas[1] = 1221;
        mas[2] = 19;
        mas[3] = 2344;
        mas[4] = 123;

        int expectedResult= service.sumOfPrimeNumbers(n, mas);

        assertEquals(30, expectedResult);

        mas[0] = 139;
        mas[1] = 181;
        mas[2] = 193;
        mas[3] = 3347;
        mas[4] = 3389;

        expectedResult= service.sumOfPrimeNumbers(n, mas);

        assertEquals(7249, expectedResult);
    }

    @Test
    void throwExceptionIfValuesZero(){
        int n = 0;
        int[] mas = new int[n];

        assertThrows(ValueCommandDataException.class, () -> service.sumOfPrimeNumbers(n, mas));
    }
}
