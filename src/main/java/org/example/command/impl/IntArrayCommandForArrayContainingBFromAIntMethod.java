package org.example.command.impl;

import lombok.AllArgsConstructor;
import org.example.command.Command;
import org.example.data.Integer2ValuesCommandData;
import org.example.exception.InCorrectParameterException;
import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

@AllArgsConstructor
public class IntArrayCommandForArrayContainingBFromAIntMethod implements Command<IntArrayCommandResult> {
    private Service service;
    @Override
    public IntArrayCommandResult execute(CommandParams commandParams) throws NegativeException, InCorrectParameterException, ValueCommandDataException {
        if(!(commandParams instanceof Integer2ValuesCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
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