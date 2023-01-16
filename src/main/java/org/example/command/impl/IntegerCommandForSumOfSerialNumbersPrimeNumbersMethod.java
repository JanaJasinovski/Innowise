package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;

public class IntegerCommandForSumOfSerialNumbersPrimeNumbersMethod implements Command<IntegerCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntegerCommandResult execute(CommandParams commandParams) throws Exception {
        int allNNaturalDivisors = service.sumOfSerialNumbersPrimeNumbers(((IntegerValueAndArrayCommandData) commandParams).a, ((IntegerValueAndArrayCommandData) commandParams).array);
        IntegerCommandResult intArrayCommandResult = new IntegerCommandResult();
        intArrayCommandResult.value = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}
