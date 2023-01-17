package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindKNumberInSequencesTest {
    private final Service service = new ServiceImpl();
    @Test
    void findKNumberInSequences() throws NegativeException, ValueCommandDataException {
        int k = 5;

        int expectedResult = service.findKNumberInSequences(k);

        Assertions.assertEquals(10, expectedResult);

        k = 20;

        expectedResult = service.findKNumberInSequences(k);

        Assertions.assertEquals(14, expectedResult);
    }

    @Test
    void returnAIfBIsZeroTest() {
        int n = 0;

        assertThrows(ValueCommandDataException.class, () -> service.findKNumberInSequences(n));
    }

    @Test
    void throwExceptionIfNumbersIsNegativeTest() {
        int n = -20;

        assertThrows(NegativeException.class, () -> service.findKNumberInSequences(n));
    }
}
