package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.model.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumOfFirstNNaturalNumbersArePowers5Test {
    private final Service service = new ServiceImpl();

    @Test
    void sumTest() throws NegativeException {
        int a = 1;

        int expectedResult = service.sumOfFirstNNaturalNumbersArePowers5(a);

        assertEquals(5, expectedResult);

        a = 2;

        expectedResult = service.sumOfFirstNNaturalNumbersArePowers5(a);

        assertEquals(30, expectedResult);
    }

    @Test
    void negativeTest() {
        int a = -1234;

        assertThrows(NegativeException.class, () -> service.sumOfFirstNNaturalNumbersArePowers5(a));
    }
}
