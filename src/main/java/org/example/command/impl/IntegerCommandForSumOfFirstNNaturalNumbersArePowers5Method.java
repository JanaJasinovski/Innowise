package org.example.command.impl;

import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;

public class IntegerCommandForSumOfFirstNNaturalNumbersArePowers5Method implements Command<IntegerCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntegerCommandResult insertParametersIntoVariousMethods(CommandParams commandParams) throws Exception {
        int integerValue = service.sumOfFirstNNaturalNumbersArePowers5(((IntegerValueCommandData) commandParams).a);
        IntegerCommandResult integerCommandResult = new IntegerCommandResult();
        integerCommandResult.value = integerValue;
        return integerCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}
