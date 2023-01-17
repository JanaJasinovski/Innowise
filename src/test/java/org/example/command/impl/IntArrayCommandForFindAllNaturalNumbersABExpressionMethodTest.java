package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueCommandData;
import org.example.data.IntegerValueCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class IntArrayCommandForFindAllNaturalNumbersABExpressionMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntArrayCommandForFindAllNaturalNumbersABExpressionMethod command;
    @Test
    void shouldFindAllNaturalNumbersABExpressionTest() throws Exception {
        IntegerValueCommandData data = new IntegerValueCommandData(5000); // to do
        int[] array = new int[]{1665, 1};
        when(mockService.findAllNaturalNumbersABExpression(5000)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).findAllNaturalNumbersABExpression(5000);
        assertArrayEquals(array,result.intArray);
    }

    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}