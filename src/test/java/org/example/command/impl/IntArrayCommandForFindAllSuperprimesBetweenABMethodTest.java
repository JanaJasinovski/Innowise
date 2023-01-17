package org.example.command.impl;

import org.example.command.Command;
import org.example.data.Integer2ValuesCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntArrayCommandForFindAllSuperprimesBetweenABMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        Integer2ValuesCommandData data = new Integer2ValuesCommandData(1, 2); // to do
        Command<IntArrayCommandResult> command = new IntArrayCommandForFindAllSuperprimesBetweenABMethod(mockService);
        int[] array = new int[]{0};
        when(mockService.findAllSuperprimesBetweenAB(1, 2)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).findAllSuperprimesBetweenAB(1, 2);
        assertArrayEquals(array,result.intArray);
    }
}