package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntegerCommandForFindHighestPowerOfFractionalMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        IntegerValueCommandData data = new IntegerValueCommandData(5); // to do
        Command<IntegerCommandResult> command = new IntegerCommandForFindHighestPowerOfFractionalMethod(mockService);
        when(mockService.findHighestPowerOfFactorial(5)).thenReturn(6);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).findHighestPowerOfFactorial(5);
        assertEquals(6,result.value);
    }
}