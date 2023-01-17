package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntegerCommandForFindColNumbersInLongestSubsequenceNumbersSortedASCMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        int[] array = new int[] {1,2,3,4,5,0,7,8,9};
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData(10, array); // to do
        Command<IntegerCommandResult> command = new IntegerCommandForFindColNumbersInLongestSubsequenceNumbersSortedASCMethod(mockService);
        when(mockService.findColNumbersInLongestSubsequenceNumbersSortedASC(10,array)).thenReturn(0);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).findColNumbersInLongestSubsequenceNumbersSortedASC(10,array);
        assertEquals(0,result.value);
    }
}