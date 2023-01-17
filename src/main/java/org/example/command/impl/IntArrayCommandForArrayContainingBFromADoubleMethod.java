package org.example.command.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.command.Command;
import org.example.data.DoubleValueCommandData;
import org.example.data.DoubleValueIntegerValueCommandData;
import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

@AllArgsConstructor
public class IntArrayCommandForArrayContainingBFromADoubleMethod implements Command<IntArrayCommandResult> {
    private final Service service;
    @Override
    public IntArrayCommandResult execute(CommandParams commandParams) throws NegativeException, ValueCommandDataException {
        if(!(commandParams instanceof DoubleValueIntegerValueCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        int[] ints = service.arrayContainingBFromADouble(
                ((DoubleValueIntegerValueCommandData) commandParams).a,
                ((DoubleValueIntegerValueCommandData) commandParams).b
        );
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = ints;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}
