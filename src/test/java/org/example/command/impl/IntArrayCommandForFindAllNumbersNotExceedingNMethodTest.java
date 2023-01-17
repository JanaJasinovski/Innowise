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
class IntArrayCommandForFindAllNumbersNotExceedingNMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntArrayCommandForFindAllNumbersNotExceedingNMethod command;
    @Test
    void shouldFindAllNumbersNotExceedingNMTest() throws Exception {
        IntegerValueCommandData data = new IntegerValueCommandData(160); // to do
        int[] a = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
                79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157};
        when(mockService.findAllNumbersNotExceedingN(160)).thenReturn(a);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).findAllNumbersNotExceedingN(160);
        assertArrayEquals(a,result.intArray);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}