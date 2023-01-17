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
        int n = 5;
        int[] array = new int[n];
        array[0] = 123;
        array[1] = 1221;
        array[2] = 1234;
        array[3] = 2344;
        array[4] = 123;
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData(5, array); // to do
        Command<IntArrayCommandResult> command = new IntArrayCommandForFindAllNumbersSumFirstTwoDigitsEqualSumLastDigitsMethod(mockService);
        when(mockService.findAllNumbersSumFirstTwoDigitsEqualSumLastDigits(5, array)).thenReturn(new int[]{1221});

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).findAllNumbersSumFirstTwoDigitsEqualSumLastDigits(5, array);
        assertArrayEquals(new int[]{1221},result.intArray);
    }
}