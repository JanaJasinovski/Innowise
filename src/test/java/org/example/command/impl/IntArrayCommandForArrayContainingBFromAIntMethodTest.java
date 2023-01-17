package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueIntegerValueCommandData;
import org.example.data.Integer2ValuesCommandData;
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
class IntArrayCommandForArrayContainingBFromAIntMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntArrayCommandForArrayContainingBFromADoubleMethod command;
    @Test
    void shouldCheckArrayContainingBFromAIntTest() throws Exception {
        Integer2ValuesCommandData data = new Integer2ValuesCommandData(3451, 3);
        int[] array = new int[]{3,4,5};
        when(mockService.arrayContainingBFromAInt(3451,3)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).arrayContainingBFromAInt(3451,3);
        assertArrayEquals(array,result.intArray);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}