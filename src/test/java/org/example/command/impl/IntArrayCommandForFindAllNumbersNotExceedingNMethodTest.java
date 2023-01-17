package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntArrayCommandForFindAllNumbersNotExceedingNMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        IntegerValueCommandData data = new IntegerValueCommandData(160); // to do
        int[] a = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
                79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157};
        Command<IntArrayCommandResult> command = new IntArrayCommandForFindAllNumbersNotExceedingNMethod(mockService);
        when(mockService.findAllNumbersNotExceedingN(160)).thenReturn(a);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).findAllNumbersNotExceedingN(160);
        assertArrayEquals(a,result.intArray);
    }

}