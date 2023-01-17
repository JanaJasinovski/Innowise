package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class IntegerCommandForSumOfSerialNumbersPrimeNumbersMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntegerCommandForSumOfSerialNumbersPrimeNumbersMethod command;
    @Test
    void shouldFindSumOfSerialNumbersPrimeNumbersTest() throws Exception {
        int n = 5;
        int[] array = new int[n];
        array[0] = 123;
        array[1] = 1221;
        array[2] = 1234;
        array[3] = 2344;
        array[4] = 123;
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData(n, array);
        when(mockService.sumOfSerialNumbersPrimeNumbers(n, array)).thenReturn(3578);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).sumOfSerialNumbersPrimeNumbers(n, array);
        assertEquals(3578,result.value);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}