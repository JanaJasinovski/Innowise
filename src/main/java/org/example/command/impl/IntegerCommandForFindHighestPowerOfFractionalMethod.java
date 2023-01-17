package org.example.command.impl;

import lombok.AllArgsConstructor;
import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;

@AllArgsConstructor
public class IntegerCommandForFindHighestPowerOfFractionalMethod implements Command<IntegerCommandResult> {
    private Service service;

    @Override
    public IntegerCommandResult execute(CommandParams commandParams) throws Exception {
        if(!(commandParams instanceof IntegerValueCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        int allNNaturalDivisors = service.findHighestPowerOfFactorial(((IntegerValueCommandData) commandParams).a);
        IntegerCommandResult intArrayCommandResult = new IntegerCommandResult();
        intArrayCommandResult.value = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}