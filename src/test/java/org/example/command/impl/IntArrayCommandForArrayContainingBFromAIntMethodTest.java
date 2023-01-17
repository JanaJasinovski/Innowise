package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueIntegerValueCommandData;
import org.example.data.Integer2ValuesCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntArrayCommandForArrayContainingBFromAIntMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        Integer2ValuesCommandData data = new Integer2ValuesCommandData(1, 22); // to do
        int[] array = new int[]{0};
        Command<IntArrayCommandResult> command = new IntArrayCommandForArrayContainingBFromAIntMethod(mockService);
        when(mockService.arrayContainingBFromAInt(1,22)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).arrayContainingBFromAInt(1,22);
        assertArrayEquals(array,result.intArray);
    }

}