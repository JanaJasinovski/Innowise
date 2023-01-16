package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfSerialNumbersPrimeNumbersTest {
    private final Service service = new ServiceImpl();
    @Test
    void sumOfSerialNumbersPrimeNumbersTest() throws NegativeException, ValueCommandDataException {
        int n = 5;
        int[] mas = new int[n];
        mas[0] = 123;
        mas[1] = 1221;
        mas[2] = 1234;
        mas[3] = 2344;
        mas[4] = 123;

        int expectedResult= service.sumOfSerialNumbersPrimeNumbers(n, mas);

        assertEquals(3578, expectedResult);


        mas[0] = 1111;
        mas[1] = 2445;
        mas[2] = 1;
        mas[3] = 2992;
        mas[4] = 123;

        expectedResult= service.sumOfSerialNumbersPrimeNumbers(n, mas);

        assertEquals(2993, expectedResult);
    }

    @Test
    void throwExceptionIfValuesZero(){
        int n = 0;
        int[] mas = new int[n];

        assertThrows(ValueCommandDataException.class, () -> service.findAllNumbersSumFirstTwoDigitsEqualSumLastDigits(n, mas));
    }
}
