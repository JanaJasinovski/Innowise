package org.example.command.impl;

import org.example.command.Command;
import org.example.data.Integer2ValuesCommandData;
import org.example.exception.InCorrectParameterException;
import org.example.exception.NegativeException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

public class IntArrayCommandForArrayContainingBFromAIntMethod implements Command<IntArrayCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntArrayCommandResult insertParametersIntoVariousMethods(CommandParams commandParams) throws NegativeException, InCorrectParameterException {
        int[] ints = service.arrayContainingBFromAInt(
                ((Integer2ValuesCommandData) commandParams).a,
                ((Integer2ValuesCommandData) commandParams).b);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = ints;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}