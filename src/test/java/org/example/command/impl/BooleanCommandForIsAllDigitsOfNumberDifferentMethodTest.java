package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.BooleanCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BooleanCommandForIsAllDigitsOfNumberDifferentMethodTest {
    @Test
    void isAllDigitsOfNumberDifferentMethodTest() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        IntegerValueCommandData data = new IntegerValueCommandData(2); // to do
        Command<BooleanCommandResult> command = new BooleanCommandForIsSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethod(mockService);
        when(mockService.isAllDigitsOfNumberDifferent( 2)).thenReturn(false);

        BooleanCommandResult result = command.execute(data);

        verify(mockService, times(1)).isAllDigitsOfNumberDifferent( 2);
        assertFalse(result.value);
    }

}