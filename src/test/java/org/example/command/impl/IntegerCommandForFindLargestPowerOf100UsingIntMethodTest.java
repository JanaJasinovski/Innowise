package org.example.command.impl;

import org.example.command.Command;
import org.example.data.ZeroCommandData;
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
class IntegerCommandForFindLargestPowerOf100UsingIntMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntegerCommandForFindLargestPowerOf100UsingIntMethod command;
    @Test
    void shouldFindLargestPowerOf100UsingIntTest() throws Exception {
        ZeroCommandData data = new ZeroCommandData();
        when(mockService.findLargestPowerOf100UsingInt()).thenReturn(6);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).findLargestPowerOf100UsingInt();
        assertEquals(6,result.value);
    }

    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}