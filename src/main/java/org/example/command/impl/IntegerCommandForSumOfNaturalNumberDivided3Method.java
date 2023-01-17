package org.example.command.impl;

import lombok.AllArgsConstructor;
import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;

@AllArgsConstructor
public class IntegerCommandForSumOfNaturalNumberDivided3Method implements Command<IntegerCommandResult> {
    private Service service;
    @Override
    public IntegerCommandResult execute(CommandParams commandParams) throws Exception {
        if(!(commandParams instanceof IntegerValueCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        int integerValue = service.sumOfNaturalNumberDivided3(((IntegerValueCommandData) commandParams).a);
        IntegerCommandResult integerCommandResult = new IntegerCommandResult();
        integerCommandResult.value = integerValue;
        return integerCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}

