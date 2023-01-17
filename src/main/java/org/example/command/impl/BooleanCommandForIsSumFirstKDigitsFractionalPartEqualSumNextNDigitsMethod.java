package org.example.command.impl;

import lombok.AllArgsConstructor;
import org.example.command.Command;
import org.example.data.DoubleValueIntegerValueCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.BooleanCommandResult;

@AllArgsConstructor
public class BooleanCommandForIsSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethod implements Command<BooleanCommandResult> {
    private Service service;
    @Override
    public BooleanCommandResult execute(CommandParams commandParams) throws Exception {
        if(!(commandParams instanceof DoubleValueIntegerValueCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        boolean allNNaturalDivisors = service.isSumFirstKDigitsFractionalPartEqualSumNextNDigits(
                ((DoubleValueIntegerValueCommandData) commandParams).a,
                ((DoubleValueIntegerValueCommandData) commandParams).b
        );
        BooleanCommandResult intArrayCommandResult = new BooleanCommandResult();
        intArrayCommandResult.value = allNNaturalDivisors;
        return intArrayCommandResult;
    }


    @Override
    public Class<BooleanCommandResult> getType() {
        return BooleanCommandResult.class;
    }
}