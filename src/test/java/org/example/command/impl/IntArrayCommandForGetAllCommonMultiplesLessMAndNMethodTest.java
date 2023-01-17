package org.example.command.impl;

import org.example.command.Command;
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
class IntArrayCommandForGetAllCommonMultiplesLessMAndNMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntArrayCommandForGetAllCommonMultiplesLessMAndNMethod command;
    @Test
    void shouldGetAllCommonMultiplesLessMAndNTest() throws Exception {
        Integer2ValuesCommandData data = new Integer2ValuesCommandData(160, 250); // to do
        int[] array = new int[]{4000, 8000, 12000, 16000, 20000, 24000, 28000, 32000, 36000};
        when(mockService.getAllCommonMultiplesLessMAndN(160, 250)).thenReturn(array);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).getAllCommonMultiplesLessMAndN(160, 250);
        assertArrayEquals(array,result.intArray);
    }

    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}