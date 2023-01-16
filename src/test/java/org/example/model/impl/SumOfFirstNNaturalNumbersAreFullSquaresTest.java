package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumOfFirstNNaturalNumbersAreFullSquaresTest {
    private final Service service = new ServiceImpl();

    @Test
    void sum() throws NegativeException {
        int a = 5;

        int expectedResult = service.sumOfFirstNNaturalNumbersAreFullSquares(a);

        assertEquals(5, expectedResult);

        a = 30;

        expectedResult = service.sumOfFirstNNaturalNumbersAreFullSquares(a);

        assertEquals(55, expectedResult);

        a = 0;

        expectedResult = service.sumOfFirstNNaturalNumbersAreFullSquares(a);

        assertEquals(0, expectedResult);
    }

    @Test
    void negativeTest() {
        int a = -1234;

        assertThrows(NegativeException.class, () -> service.sumOfFirstNNaturalNumbersAreFullSquares(a));
    }
}
