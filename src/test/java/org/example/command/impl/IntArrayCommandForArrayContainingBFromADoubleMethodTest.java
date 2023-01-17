package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueIntegerValueCommandData;
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
class IntArrayCommandForArrayContainingBFromADoubleMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntArrayCommandForArrayContainingBFromADoubleMethod command;
    @Test
    void shouldCheckArrayContainingBFromADoubleTest() throws Exception {
        DoubleValueIntegerValueCommandData data = new DoubleValueIntegerValueCommandData(1.234, 2); // to do
        int[] array = new int[]{2,3};
        when(mockService.arrayContainingBFromADouble(1.234,2)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).arrayContainingBFromADouble(1.234,2);
        assertArrayEquals(array,result.intArray);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}