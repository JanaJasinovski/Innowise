package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueCommandData;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.BooleanCommandResult;

public class BooleanCommandForIsFirstDigitOfFractionalPartEqualToThirdDigitWholePartMethod implements Command<BooleanCommandResult> {
    Service service = new ServiceImpl();

    @Override
    public BooleanCommandResult execute(CommandParams commandParams) throws Exception {
        boolean firstDigitOfFractionalPartEqualToThirdDigitWholePart =
                service.isFirstDigitOfFractionalPartEqualToThirdDigitWholePart(((DoubleValueCommandData) commandParams).a);
        BooleanCommandResult booleanCommandResult = new BooleanCommandResult();
        booleanCommandResult.value = firstDigitOfFractionalPartEqualToThirdDigitWholePart;
        return booleanCommandResult;
    }

    @Override
    public Class<BooleanCommandResult> getType() {
        return BooleanCommandResult.class;
    }
}

