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
class IntArrayCommandForGetNMCommonDivisorsMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntArrayCommandForGetNMCommonDivisorsMethod command;
    @Test
    void shouldGetNMCommonDivisorsTest() throws Exception {
        Integer2ValuesCommandData data = new Integer2ValuesCommandData(10,55);
        int[] a= new int[] {1, 5};
        when(mockService.getNMCommonDivisors(10,55)).thenReturn(a);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).getNMCommonDivisors(10,55);
        assertArrayEquals(a,result.intArray);
    }

    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}