package org.example.command.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.BooleanCommandResult;

@AllArgsConstructor
@Getter
@Setter
public class BooleanCommandForIsAllDigitsOfNumberDifferentMethod implements Command<BooleanCommandResult> {
    private Service service;
    @Override
    public BooleanCommandResult execute(CommandParams commandParams) throws Exception {
        if(!(commandParams instanceof IntegerValueCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        boolean allNNaturalDivisors = service.isAllDigitsOfNumberDifferent(
                (((IntegerValueCommandData) commandParams).a)
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