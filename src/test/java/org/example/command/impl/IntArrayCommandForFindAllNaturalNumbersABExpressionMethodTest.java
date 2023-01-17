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
        Command<IntArrayCommandResult> command = new IntArrayCommandForArrayContainingBFromADoubleMethod(mockService);
        when(mockService.findAllNaturalNumbersABExpression(1)).thenReturn(null);
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).findAllNaturalNumbersABExpression(1);
        assertEquals(array,result.intArray);
    }

}