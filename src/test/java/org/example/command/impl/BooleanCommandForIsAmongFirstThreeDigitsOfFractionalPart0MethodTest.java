package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueCommandData;
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
class BooleanCommandForIsAmongFirstThreeDigitsOfFractionalPart0MethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private BooleanCommandForIsAmongFirstThreeDigitsOfFractionalPart0Method command;
    @Test
    void shouldCheckAmongFirstThreeDigitsOfFractionalPart0MTest() throws Exception {
        DoubleValueCommandData data = new DoubleValueCommandData(1.2034);
        when(mockService.isAmongFirstThreeDigitsOfFractionalPart0(1.2034)).thenReturn(true);

        BooleanCommandResult result = command.execute(data);

        verify(mockService, times(1)).isAmongFirstThreeDigitsOfFractionalPart0(1.2034);
        assertTrue(result.value);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}