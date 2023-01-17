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
class IntegerCommandForSumOfPrimeNumbersMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntegerCommandForSumOfPrimeNumbersMethod command;
    @Test
    void shouldFindSumOfPrimeNumbersTest() throws Exception {
        int n = 5;
        int[] array = new int[n];
        array[0] = 11;
        array[1] = 1221;
        array[2] = 19;
        array[3] = 2344;
        array[4] = 123;
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData(n, array);
        when(mockService.sumOfPrimeNumbers(n, array)).thenReturn(30);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).sumOfPrimeNumbers(n, array);
        assertEquals(30,result.value);
    }

    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}