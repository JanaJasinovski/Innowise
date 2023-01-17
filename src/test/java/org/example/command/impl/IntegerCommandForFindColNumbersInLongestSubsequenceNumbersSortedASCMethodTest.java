package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class IntegerCommandForFindColNumbersInLongestSubsequenceNumbersSortedASCMethodTest {
    @Mock
    private Service mockService;
    @InjectMocks
    private IntegerCommandForFindColNumbersInLongestSubsequenceNumbersSortedASCMethod command;
    @Test
    void shouldFindColNumbersInLongestSubsequenceNumbersSortedASCTest() throws Exception {
        int[] array = new int[] { 1, 2, 3, 0, 5, 6, 7, 8, 9};
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData(11, array); // to do
        when(mockService.findColNumbersInLongestSubsequenceNumbersSortedASC(11,array)).thenReturn(6);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).findColNumbersInLongestSubsequenceNumbersSortedASC(11,array);
        assertEquals(6,result.value);
    }
    @Test
    void shouldCheckArgumentCorrectTest() throws Exception {
        CommandParams data = Mockito.mock(CommandParams.class);

        assertThrows(ValueCommandDataException.class, () -> command.execute(data));
    }
}