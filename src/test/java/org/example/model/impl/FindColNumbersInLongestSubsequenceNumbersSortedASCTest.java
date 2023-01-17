package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindColNumbersInLongestSubsequenceNumbersSortedASCTest {
    private final Service service = new ServiceImpl();

    @Test
    void findColNumbersInLongestSubsequenceNumbersSortedASC() throws NegativeException, ValueCommandDataException {
        int n = 5;
        int[] array = new int[]{
                1, 2, 3, 0, 5
        };

        int expectedResult = service.findColNumbersInLongestSubsequenceNumbersSortedASC(n, array);

        assertEquals(3, expectedResult);

        n = 11;
        array = new int[]{
                1, 2, 3, 0, 5, 6, 7, 8, 9
        };

        expectedResult = service.findColNumbersInLongestSubsequenceNumbersSortedASC(n, array);

        assertEquals(6, expectedResult);
    }

    @Test
    void returnAIfBIsZeroTest() {
        int n = 0;
        int[] array = new int[]{
                1, 2, 3, 0, 5, 6, 7, 8, 9
        };

        assertThrows(ValueCommandDataException.class, () -> service.findColNumbersInLongestSubsequenceNumbersSortedASC(n, array));
    }

    @Test
    void throwExceptionIfNumbersIsNegativeTest() {
        int n = -20;
        int[] array = new int[]{
                1, 2, 3, 0, 5, 6, 7, 8, 9
        };
        assertThrows(NegativeException.class, () -> service.findColNumbersInLongestSubsequenceNumbersSortedASC(n, array));
    }
}
