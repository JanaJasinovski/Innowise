package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueIntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntArrayCommandForArrayContainingBFromADoubleMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        DoubleValueIntegerValueCommandData data = new DoubleValueIntegerValueCommandData(1.234, 2); // to do
        int[] array = new int[]{2,3};
        Command<IntArrayCommandResult> command = new IntArrayCommandForArrayContainingBFromADoubleMethod(mockService);
        when(mockService.arrayContainingBFromADouble(1.234,2)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).arrayContainingBFromADouble(1.234,2);
        assertArrayEquals(array,result.intArray);
    }

}