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
class IntegerCommandForSumOfFirstNNaturalNumbersArePowers5MethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntegerCommandForSumOfFirstNNaturalNumbersArePowers5Method command;
    @Test
    void shouldFindSumOfFirstNNaturalNumbersArePowers5Test() throws Exception {
        IntegerValueCommandData data = new IntegerValueCommandData(2); // to do
        when(mockService.sumOfFirstNNaturalNumbersArePowers5(2)).thenReturn(30);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).sumOfFirstNNaturalNumbersArePowers5(2);
        assertEquals(30,result.value);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}