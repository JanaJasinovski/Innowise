package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntegerCommandForSumOfNaturalNumberDivided3MethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        IntegerValueCommandData data = new IntegerValueCommandData(10); // to do
        Command<IntegerCommandResult> command = new IntegerCommandForSumOfNaturalNumberDivided3Method(mockService);
        when(mockService.sumOfNaturalNumberDivided3(10)).thenReturn(18);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).sumOfNaturalNumberDivided3(10);
        assertEquals(18,result.value);
    }
}