package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueCommandData;
import org.example.model.Service;
import org.example.result.impl.BooleanCommandResult;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BooleanCommandForIsAmongFirstThreeDigitsOfFractionalPart0MethodTest {
    @Test
    void test() throws Exception {
        Service mockService = Mockito.mock(Service.class);
        DoubleValueCommandData data = new DoubleValueCommandData(1.2034); // to do
        Command<BooleanCommandResult> command = new BooleanCommandForIsAmongFirstThreeDigitsOfFractionalPart0Method(mockService);
        when(mockService.isAmongFirstThreeDigitsOfFractionalPart0(1.2034)).thenReturn(true);

        BooleanCommandResult result = command.execute(data);

        verify(mockService, times(1)).isAmongFirstThreeDigitsOfFractionalPart0(1.2034);
        assertTrue(result.value);
    }

}