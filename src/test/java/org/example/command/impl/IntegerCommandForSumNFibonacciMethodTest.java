package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
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
class IntegerCommandForSumNFibonacciMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntegerCommandForSumNFibonacciMethod command;
    @Test
    void shouldFindSumNFibonacciTest() throws Exception {
        IntegerValueCommandData data = new IntegerValueCommandData(5);
        when(mockService.sumNFibonacci(5)).thenReturn(12);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).sumNFibonacci(5);
        assertEquals(12,result.value);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}