package org.example.command.impl;

import org.example.command.Command;
import org.example.data.SecondCommandData;
import org.example.exception.NegativeException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

public class SecondCommand implements Command<IntArrayCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntArrayCommandResult insertParameters(CommandParams commandParams) throws NegativeException {
        int[] ints = service.arrayContainingBFromADouble(
                ((SecondCommandData) commandParams).a,
                ((SecondCommandData) commandParams).b);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = ints;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}
