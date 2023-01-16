package org.example.model.impl;

import org.example.exception.InCorrectParameterException;
import org.example.model.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsFirstDigitOfFractionalPartEqualToThirdDigitWholePartTest {
    private final Service service = new ServiceImpl();

    @Test
    void numberATest() throws InCorrectParameterException {
        double a = 2.2;

        boolean expectedResult = service.isFirstDigitOfFractionalPartEqualToThirdDigitWholePart(a);

        assertFalse(expectedResult);

        a = 2.04;

        expectedResult = service.isFirstDigitOfFractionalPartEqualToThirdDigitWholePart(a);

        assertFalse(expectedResult);

        a = 316.35305;

        expectedResult = service.isFirstDigitOfFractionalPartEqualToThirdDigitWholePart(a);

        assertTrue(expectedResult);

        a = 134.1902;

        expectedResult = service.isFirstDigitOfFractionalPartEqualToThirdDigitWholePart(a);

        assertTrue(expectedResult);
    }
}
