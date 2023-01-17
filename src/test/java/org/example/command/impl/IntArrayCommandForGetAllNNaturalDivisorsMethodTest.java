package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntArrayCommandForGetAllNNaturalDivisorsMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        IntegerValueCommandData data = new IntegerValueCommandData(130); // to do
        int[] array = new int[]{1, 2, 5, 10, 13, 26, 65, 130};
        Command<IntArrayCommandResult> command = new IntArrayCommandForGetAllNNaturalDivisorsMethod(mockService);
        when(mockService.getAllNNaturalDividors(130)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).getAllNNaturalDividors(130);
        assertArrayEquals(array,result.intArray);
    }
}