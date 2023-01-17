package org.example.command.impl;

import org.example.command.Command;
import org.example.data.Integer2ValuesCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntArrayCommandForGetAllCommonMultiplesLessMAndNMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        Integer2ValuesCommandData data = new Integer2ValuesCommandData(160, 250); // to do
        int[] array = new int[]{4000, 8000, 12000, 16000, 20000, 24000, 28000, 32000, 36000};
        Command<IntArrayCommandResult> command = new IntArrayCommandForGetAllCommonMultiplesLessMAndNMethod(mockService);
        when(mockService.getAllCommonMultiplesLessMAndN(160, 250)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).getAllCommonMultiplesLessMAndN(160, 250);
        assertArrayEquals(array,result.intArray);
    }
}