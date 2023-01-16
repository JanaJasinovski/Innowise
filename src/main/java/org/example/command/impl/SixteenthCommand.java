package org.example.command.impl;

import main.model.impl.ServiceImpl;
import org.example.command.Command;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;

public class SixteenthCommand implements Command<IntegerCommandResult> {
    Service service = new ServiceImpl();

    @Override
    public IntegerCommandResult insertParameters(CommandParams commandParams) throws Exception {
        int allNNaturalDivisors = service.findLargestPowerOf100UsingInt();
        IntegerCommandResult intArrayCommandResult = new IntegerCommandResult();
        intArrayCommandResult.value = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}