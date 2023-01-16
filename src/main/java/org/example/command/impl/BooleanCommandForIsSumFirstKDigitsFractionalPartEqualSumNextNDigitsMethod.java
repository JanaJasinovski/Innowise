package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueIntegerValueCommandData;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.BooleanCommandResult;

public class BooleanCommandForIsSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethod implements Command<BooleanCommandResult> {
    Service service = new ServiceImpl();

    @Override
    public BooleanCommandResult insertParametersIntoVariousMethods(CommandParams commandParams) throws Exception {
        boolean allNNaturalDivisors = service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(((DoubleValueIntegerValueCommandData) commandParams).a, ((DoubleValueIntegerValueCommandData) commandParams).b);
        BooleanCommandResult intArrayCommandResult = new BooleanCommandResult();
        intArrayCommandResult.value = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<BooleanCommandResult> getType() {
        return BooleanCommandResult.class;
    }
}