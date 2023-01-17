package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntArrayCommandForFindAllNumbersSumFirstTwoDigitsEqualSumLastDigitsMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData(1, array); // to do
        Command<IntArrayCommandResult> command = new IntArrayCommandForArrayContainingBFromADoubleMethod(mockService);
        when(mockService.findAllNumbersSumFirstTwoDigitsEqualSumLastDigits(1, array)).thenReturn(null);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).findAllNumbersSumFirstTwoDigitsEqualSumLastDigits(1, array);
        assertArrayEquals(array,result.intArray);
    }
}