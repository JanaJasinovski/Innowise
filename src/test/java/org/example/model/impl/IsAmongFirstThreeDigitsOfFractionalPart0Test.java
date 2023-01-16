package org.example.model.impl;

import org.example.exception.InCorrectParameterException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsAmongFirstThreeDigitsOfFractionalPart0Test {
    private final Service service = new ServiceImpl();

    @Test
    void numberATest() throws InCorrectParameterException {
        double a = 2.2;

        boolean expectedResult = service.isAmongFirstThreeDigitsOfFractionalPart0(a);

        assertFalse(expectedResult);

        a = 2.04;

        expectedResult = service.isAmongFirstThreeDigitsOfFractionalPart0(a);

        assertTrue(expectedResult);

        a = 3.33305;

        expectedResult = service.isAmongFirstThreeDigitsOfFractionalPart0(a);

        assertFalse(expectedResult);

        a = 434.8902;

        expectedResult = service.isAmongFirstThreeDigitsOfFractionalPart0(a);

        assertTrue(expectedResult);
    }
}
