package org.example.model.impl;

import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindLargestPowerOf3UsingShortTest {
    private final Service service = new ServiceImpl();

    @Test
    void findLargestPowerOf3UsingShortTest() {
        int expectedResult = service.findLargestPowerOf3UsingShort();

        assertEquals(6, expectedResult);
    }
}
