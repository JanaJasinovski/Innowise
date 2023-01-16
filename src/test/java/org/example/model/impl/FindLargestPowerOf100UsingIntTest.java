package org.example.model.impl;

import org.example.model.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindLargestPowerOf100UsingIntTest {
    private final Service service = new ServiceImpl();

    @Test
    void findLargestPowerOf100UsingIntTest() {
        int expectedResult = service.findLargestPowerOf100UsingInt();

        Assertions.assertEquals(6, expectedResult);
    }
}
