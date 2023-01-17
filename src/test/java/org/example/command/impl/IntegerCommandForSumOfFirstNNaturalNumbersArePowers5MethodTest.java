package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntegerCommandForSumOfFirstNNaturalNumbersArePowers5MethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        IntegerValueCommandData data = new IntegerValueCommandData(2); // to do
        Command<IntegerCommandResult> command = new IntegerCommandForSumOfFirstNNaturalNumbersArePowers5Method(mockService);
        when(mockService.sumOfFirstNNaturalNumbersArePowers5(2)).thenReturn(2);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).sumOfFirstNNaturalNumbersArePowers5(2);
        assertEquals(2,result.value);
    }
}