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
        IntegerValueCommandData data = new IntegerValueCommandData(5000); // to do
        Command<IntArrayCommandResult> command = new IntArrayCommandForFindAllNaturalNumbersABExpressionMethod(mockService);
        int[] array = new int[]{1665, 1};
        when(mockService.findAllNaturalNumbersABExpression(5000)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).findAllNaturalNumbersABExpression(5000);
        assertArrayEquals(array,result.intArray);
    }

}