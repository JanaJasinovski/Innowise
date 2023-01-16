package org.example.model.impl;

import org.example.model.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsAllDigitsOfNumberDifferentTest {
    private final Service service = new ServiceImpl();

    @Test
    void isAllDigitsOfNumberDifferentTest() {
        int n = 5323;

        boolean expectedResult = service.isAllDigitsOfNumberDifferent(n);

        assertFalse(expectedResult);

        n = 5432;

        expectedResult = service.isAllDigitsOfNumberDifferent(n);

        assertTrue(expectedResult);
    }
}
