package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.model.Service;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntegerCommandForSumOfSerialNumbersPrimeNumbersMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        int[] array = new int[] {1,2,3,4,5,6,7,8,9};
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData(2, array); // to do
        Command<IntegerCommandResult> command = new IntegerCommandForSumOfSerialNumbersPrimeNumbersMethod(mockService);
        when(mockService.sumOfSerialNumbersPrimeNumbers(2, array)).thenReturn(2);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).sumOfSerialNumbersPrimeNumbers(2, array);
        assertEquals(2,result.value);
    }
}