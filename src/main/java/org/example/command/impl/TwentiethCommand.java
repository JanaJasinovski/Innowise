package org.example.command.impl;

import main.model.impl.ServiceImpl;
import org.example.command.Command;
import org.example.data.SecondCommandData;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.BooleanCommandResult;

public class TwentiethCommand implements Command<BooleanCommandResult> {
    Service service = new ServiceImpl();

    @Override
    public BooleanCommandResult insertParameters(CommandParams commandParams) throws Exception {
        boolean allNNaturalDivisors = service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(((SecondCommandData) commandParams).a, ((SecondCommandData) commandParams).b);
        BooleanCommandResult intArrayCommandResult = new BooleanCommandResult();
        intArrayCommandResult.value = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<BooleanCommandResult> getType() {
        return BooleanCommandResult.class;
    }
}