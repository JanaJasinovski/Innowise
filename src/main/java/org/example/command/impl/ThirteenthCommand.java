package org.example.command.impl;

import org.example.command.Command;
import org.example.data.FiveCommandData;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

public class ThirteenthCommand implements Command<IntArrayCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntArrayCommandResult insertParameters(CommandParams commandParams) throws Exception {
        int[] allNNaturalDivisors = service.findAllNumbersSumFirstTwoDigitsEqualSumLastDigits(((FiveCommandData) commandParams).a, ((FiveCommandData) commandParams).array);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}
