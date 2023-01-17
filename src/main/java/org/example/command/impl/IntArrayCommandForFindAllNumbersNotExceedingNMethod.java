package org.example.command.impl;

import lombok.AllArgsConstructor;
import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

@AllArgsConstructor
public class IntArrayCommandForFindAllNumbersNotExceedingNMethod implements Command<IntArrayCommandResult> {
    private Service service;
    @Override
    public IntArrayCommandResult execute(CommandParams commandParams) throws Exception {
        if(!(commandParams instanceof IntegerValueCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        int[] allNNaturalDivisors = service.findAllNumbersNotExceedingN(((IntegerValueCommandData) commandParams).a);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}
