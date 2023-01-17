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
class IntegerCommandForSumOfNaturalNumberDivided3MethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntegerCommandForSumOfNaturalNumberDivided3Method command;
    @Test
    void shouldFindSumOfNaturalNumberDivided3Test() throws Exception {
        IntegerValueCommandData data = new IntegerValueCommandData(10);
        when(mockService.sumOfNaturalNumberDivided3(10)).thenReturn(18);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).sumOfNaturalNumberDivided3(10);
        assertEquals(18,result.value);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}