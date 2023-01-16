package org.example.command.impl;

import org.example.command.Command;
import org.example.data.Integer3ValuesCommandData;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

public class IntArrayCommandForFindAllNaturalNumbersABExpressionMethod implements Command<IntArrayCommandResult> {
    Service service = new ServiceImpl();

    @Override
    public IntArrayCommandResult execute(CommandParams commandParams) throws Exception {
        int[] allNNaturalDivisors = service.findAllNaturalNumbersABExpression(((Integer3ValuesCommandData) commandParams).a, ((Integer3ValuesCommandData) commandParams).b, ((Integer3ValuesCommandData) commandParams).c);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}