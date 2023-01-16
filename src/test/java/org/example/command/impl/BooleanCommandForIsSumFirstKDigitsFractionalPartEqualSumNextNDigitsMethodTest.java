package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueIntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.BooleanCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BooleanCommandForIsSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethodTest {
    @Test
    void firstTest() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        DoubleValueIntegerValueCommandData data = new DoubleValueIntegerValueCommandData(1.234, 2); // to do
        Command<BooleanCommandResult> command = new BooleanCommandForIsSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethod(mockService);
        when(mockService.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(1.234, 2)).thenReturn(false);

        BooleanCommandResult result = command.execute(data);

        verify(mockService, times(1)).isSumFirstKDigitsFractionalPartEqualSumNextNDigits(1.234, 2);
        assertFalse(result.value);
    }

}