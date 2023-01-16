package org.example.model.impl;

import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNaturalNumberDivided3Test {

    private final Service service = new ServiceImpl();
    @Test
    void sum() {
        int a = 10;

        int expectedResult = service.sumOfNaturalNumberDivided3(a);

        assertEquals(18, expectedResult);

        a = 30;

        expectedResult = service.sumOfNaturalNumberDivided3(a);

        assertEquals(165, expectedResult);
    }
}
