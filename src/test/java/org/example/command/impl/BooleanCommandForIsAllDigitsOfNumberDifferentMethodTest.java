package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.BooleanCommandResult;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class BooleanCommandForIsAllDigitsOfNumberDifferentMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private BooleanCommandForIsAllDigitsOfNumberDifferentMethod command;
    @Test
    void shouldCheckAllDigitsOfNumberDifferentMethodTest() throws Exception {
        IntegerValueCommandData data = new IntegerValueCommandData(234); // to do
        when(mockService.isAllDigitsOfNumberDifferent( 234)).thenReturn(true);

        BooleanCommandResult result = command.execute(data);

        verify(mockService, times(1)).isAllDigitsOfNumberDifferent( 234);
        assertTrue(result.value);
    }

    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}