package org.example.command.impl;

import lombok.AllArgsConstructor;
import org.example.command.Command;
import org.example.data.IntegerValueCommandData;
import org.example.exception.NegativeException;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;
@AllArgsConstructor
public class IntegerCommandForFindKNumberInSequencesMethod implements Command<IntegerCommandResult> {
    private Service service;
    @Override
    public IntegerCommandResult execute(CommandParams commandParams) throws NegativeException, ValueCommandDataException {
        if(!(commandParams instanceof IntegerValueCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        int ints = service.findKNumberInSequences(((IntegerValueCommandData) commandParams).a);
        IntegerCommandResult intArrayCommandResult = new IntegerCommandResult();
        intArrayCommandResult.value = ints;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}
