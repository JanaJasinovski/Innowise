package org.example.command.impl;

import org.example.command.Command;
import org.example.data.SixCommandData;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

public class TwentyFirstCommand implements Command<IntArrayCommandResult> {
    Service service = new ServiceImpl();

    @Override
    public IntArrayCommandResult insertParameters(CommandParams commandParams) throws Exception {
        int[] allNNaturalDivisors = service.findAllNaturalNumbersABExpression(((SixCommandData) commandParams).a, ((SixCommandData) commandParams).b, ((SixCommandData) commandParams).c);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}