package org.example.command.impl;

import main.model.impl.ServiceImpl;
import org.example.command.Command;
import org.example.data.FourthCommandData;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;


public class TwelfthCommand implements Command<IntArrayCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntArrayCommandResult insertParameters(CommandParams commandParams) throws Exception {
        int[] allNNaturalDivisors = service.findAllNumbersNotExceedingN(((FourthCommandData) commandParams).a);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}
