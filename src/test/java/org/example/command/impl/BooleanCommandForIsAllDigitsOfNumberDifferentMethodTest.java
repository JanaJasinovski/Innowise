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
        IntegerValueCommandData data = new IntegerValueCommandData(234); // to do
        Command<BooleanCommandResult> command = new BooleanCommandForIsAllDigitsOfNumberDifferentMethod(mockService);
        when(mockService.isAllDigitsOfNumberDifferent( 234)).thenReturn(true);

        BooleanCommandResult result = command.execute(data);

        verify(mockService, times(1)).isAllDigitsOfNumberDifferent( 234);
        assertTrue(result.value);
    }

}