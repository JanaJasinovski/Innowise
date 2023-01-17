package org.example.command.impl;

import org.example.command.Command;
import org.example.data.Integer2ValuesCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntArrayCommandForGetNMCommonDivisorsMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        Integer2ValuesCommandData data = new Integer2ValuesCommandData(10,55); // to do
        int[] a= new int[] {1, 5};
        Command<IntArrayCommandResult> command = new IntArrayCommandForGetNMCommonDivisorsMethod(mockService);
        when(mockService.getNMCommonDivisors(10,55)).thenReturn(a);

        IntArrayCommandResult result = command.execute(data);

        verify(mockService, times(1)).getNMCommonDivisors(10,55);
        assertArrayEquals(a,result.intArray);
    }
}