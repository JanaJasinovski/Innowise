package org.example.model.impl;

import org.example.model.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindHighestPowerOfFactorialTest {
    private final Service service = new ServiceImpl();

    @Test
    void findHighestPowerOfFactorialTest() {
        int n = 5;

        int expectedResult = service.findHighestPowerOfFactorial(n);

        assertEquals(6, expectedResult);
    }
}
