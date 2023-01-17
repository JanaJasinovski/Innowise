package org.example.model.impl;

import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IsSumFirstKDigitsFractionalPartEqualSumNextNDigitsTest {
    private final Service service = new ServiceImpl();

    @Test
    void isSumFirstKDigitsFractionalPartEqualSumNextNDigitsTest() throws NegativeException, ValueCommandDataException {
        double value = 234.467742;
        int n = 2;

        boolean expectedResult = service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(value, n);

        assertFalse(expectedResult);

        value = 1.241511;
        n = 3;

        expectedResult = service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(value, n);

        assertTrue(expectedResult);

        value = 1.2221;
        n = 2;

        expectedResult = service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(value, n);

        assertFalse(expectedResult);
    }

    @Test
    void throwExceptionIfValueZero(){
        double value = 234.467742;
        int n = 0;
        double finalValue = value;
        int finalN = n;

        assertThrows(ValueCommandDataException.class, () -> service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(finalValue, finalN));

        value = 0;
        n = 3;
        double finalValue1 = value;
        int finalN1 = n;

        assertThrows(ValueCommandDataException.class, () -> service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(finalValue1, finalN1));
    }

    @Test
    void throwExceptionIfValueLessZero(){
        double value = -234.467742;
        int n = 5;
        double finalValue = value;
        int finalN = n;

        assertThrows(NegativeException.class, () -> service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(finalValue, finalN));

        value = 234.467742;
        n = -5;
        double finalValue2 = value;
        int finalN2 = n;

        assertThrows(NegativeException.class, () -> service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(finalValue2, finalN2));
    }
}
