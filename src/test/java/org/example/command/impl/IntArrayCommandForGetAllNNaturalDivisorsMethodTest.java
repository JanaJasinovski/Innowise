package org.example.command.impl;

import org.example.command.Command;
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
class IntArrayCommandForGetAllNNaturalDivisorsMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntArrayCommandForGetAllNNaturalDivisorsMethod command;
    @Test
    void shouldGetAllNNaturalDivisorsTest() throws Exception {
        IntegerValueCommandData data = new IntegerValueCommandData(130);
        int[] array = new int[]{1, 2, 5, 10, 13, 26, 65, 130};
        when(mockService.getAllNNaturalDividors(130)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).getAllNNaturalDividors(130);
        assertArrayEquals(array,result.intArray);
    }

    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}