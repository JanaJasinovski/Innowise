package org.example.command.impl;

import main.model.impl.ServiceImpl;
import org.example.command.Command;
import org.example.data.FourthCommandData;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;

public class SixthCommand implements Command<IntegerCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntegerCommandResult insertParameters(CommandParams commandParams) throws Exception {
        int integerValue = service.sumOfNaturalNumberDivided3(((FourthCommandData) commandParams).a);
        IntegerCommandResult integerCommandResult = new IntegerCommandResult();
        integerCommandResult.value = integerValue;
        return integerCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}

