package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntArrayCommandForFindAllNaturalNumbersABExpressionMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        IntegerValueCommandData data = new IntegerValueCommandData(1); // to do
        Command<IntArrayCommandResult> command = new IntArrayCommandForFindAllNaturalNumbersABExpressionMethod(mockService);
        int[] array = new int[]{0};
        when(mockService.findAllNaturalNumbersABExpression(1)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).findAllNaturalNumbersABExpression(1);
        assertArrayEquals(array,result.intArray);
    }

}