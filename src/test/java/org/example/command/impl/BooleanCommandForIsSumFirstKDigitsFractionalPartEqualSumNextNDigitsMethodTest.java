package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueIntegerValueCommandData;
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
class BooleanCommandForIsSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private BooleanCommandForIsSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethod command;
    @Test
    void shouldCheckSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethodTest() throws Exception {
        DoubleValueIntegerValueCommandData data = new DoubleValueIntegerValueCommandData(1.234, 2); // to do
        when(mockService.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(1.234, 2)).thenReturn(false);

        BooleanCommandResult result = command.execute(data);

        verify(mockService, times(1)).isSumFirstKDigitsFractionalPartEqualSumNextNDigits(1.234, 2);
        assertFalse(result.value);

        data = new DoubleValueIntegerValueCommandData(1.2341, 2); // to do
        when(mockService.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(1.2341, 2)).thenReturn(true);

         result = command.execute(data);

        verify(mockService, times(1)).isSumFirstKDigitsFractionalPartEqualSumNextNDigits(1.2341, 2);
        assertTrue(result.value);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}