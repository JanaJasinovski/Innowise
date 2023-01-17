package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.model.Service;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntegerCommandForFindColNumbersInLongestSubsequenceNumbersSortedASCMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        int[] array = new int[] { 1, 2, 3, 0, 5, 6, 7, 8, 9};
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData(11, array); // to do
        Command<IntegerCommandResult> command = new IntegerCommandForFindColNumbersInLongestSubsequenceNumbersSortedASCMethod(mockService);
        when(mockService.findColNumbersInLongestSubsequenceNumbersSortedASC(11,array)).thenReturn(6);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).findColNumbersInLongestSubsequenceNumbersSortedASC(11,array);
        assertEquals(6,result.value);
    }
}