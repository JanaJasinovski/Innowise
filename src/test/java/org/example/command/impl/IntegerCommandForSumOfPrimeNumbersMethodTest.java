package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.model.Service;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntegerCommandForSumOfPrimeNumbersMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        int n = 5;
        int[] array = new int[n];
        array[0] = 11;
        array[1] = 1221;
        array[2] = 19;
        array[3] = 2344;
        array[4] = 123;
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData(n, array); // to do
        Command<IntegerCommandResult> command = new IntegerCommandForSumOfPrimeNumbersMethod(mockService);
        when(mockService.sumOfPrimeNumbers(n, array)).thenReturn(30);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).sumOfPrimeNumbers(n, array);
        assertEquals(30,result.value);
    }
}