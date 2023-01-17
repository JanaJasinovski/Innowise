package org.example.command.impl;

import lombok.AllArgsConstructor;
import org.example.command.Command;
import org.example.data.DoubleValueCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.BooleanCommandResult;

@AllArgsConstructor
public class BooleanCommandForIsFirstDigitOfFractionalPartEqualToThirdDigitWholePartMethod implements Command<BooleanCommandResult> {
    private Service service;
    @Override
    public BooleanCommandResult execute(CommandParams commandParams) throws Exception {
        if(!(commandParams instanceof DoubleValueCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        boolean firstDigitOfFractionalPartEqualToThirdDigitWholePart =
                service.isFirstDigitOfFractionalPartEqualToThirdDigitWholePart(
                        ((DoubleValueCommandData) commandParams).a
                );
        BooleanCommandResult booleanCommandResult = new BooleanCommandResult();
        booleanCommandResult.value = firstDigitOfFractionalPartEqualToThirdDigitWholePart;
        return booleanCommandResult;
    }

    @Override
    public Class<BooleanCommandResult> getType() {
        return BooleanCommandResult.class;
    }
}

