package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

public class IntArrayCommandForFindAllNumbersSumFirstTwoDigitsEqualSumLastDigitsMethod implements Command<IntArrayCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntArrayCommandResult insertParametersIntoVariousMethods(CommandParams commandParams) throws Exception {
        int[] allNNaturalDivisors = service.findAllNumbersSumFirstTwoDigitsEqualSumLastDigits(((IntegerValueAndArrayCommandData) commandParams).a, ((IntegerValueAndArrayCommandData) commandParams).array);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}
