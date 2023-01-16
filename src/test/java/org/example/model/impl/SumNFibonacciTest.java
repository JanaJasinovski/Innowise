package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumNFibonacciTest {
    private final Service service = new ServiceImpl();

    @Test
    void sum() throws NegativeException {
        int a = 5;

        int expectedResult = service.sumNFibonacci(a);

        assertEquals(12, expectedResult);

        a = 2;

        expectedResult = service.sumNFibonacci(a);

        assertEquals(2, expectedResult);

        a = 0;

        expectedResult = service.sumNFibonacci(a);

        assertEquals(0, expectedResult);
    }


    @Test
    void throwExceptionIfANegative() {
        int a = -123;

        assertThrows(NegativeException.class, () -> service.sumNFibonacci(a));

    }
}
