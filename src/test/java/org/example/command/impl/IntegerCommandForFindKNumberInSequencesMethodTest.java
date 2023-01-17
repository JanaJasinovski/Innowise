package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.model.Service;
import org.example.result.impl.IntArrayCommandResult;
import org.example.result.impl.IntegerCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IntegerCommandForFindKNumberInSequencesMethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        IntegerValueCommandData data = new IntegerValueCommandData(10); // to do
        Command<IntegerCommandResult> command = new IntegerCommandForFindKNumberInSequencesMethod(mockService);
        when(mockService.findKNumberInSequences(10)).thenReturn(0);

        IntegerCommandResult result = command.execute(data);

        verify(mockService, times(1)).findKNumberInSequences(10);
        assertEquals(0,result.value);
    }
}