package org.example.command.impl;

import org.example.command.Command;
import org.example.data.ZeroCommandData;
import org.example.model.Service;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntegerCommandForFindLargestPowerOf100UsingIntMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        ZeroCommandData data = new ZeroCommandData(); // to do
        Command<IntegerCommandResult> command = new IntegerCommandForFindLargestPowerOf100UsingIntMethod(mockService);
        when(mockService.findLargestPowerOf100UsingInt()).thenReturn(0);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).findLargestPowerOf100UsingInt();
        assertEquals(0,result.value);
    }
}