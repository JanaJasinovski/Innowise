package org.example.command.impl;

import org.example.command.Command;
import org.example.data.FirstCommandData;
import org.example.exception.NegativeException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

public class FirstCommand implements Command<IntArrayCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntArrayCommandResult insertParameters(CommandParams commandParams) throws NegativeException {
        int[] ints = service.arrayContainingBFromAInt(
                ((FirstCommandData) commandParams).a,
                ((FirstCommandData) commandParams).b);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = ints;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}