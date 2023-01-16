package org.example.command.impl;

import main.model.impl.ServiceImpl;
import org.example.command.Command;
import org.example.data.FourthCommandData;
import org.example.exception.NegativeException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;

public class TwentyFourthCommand implements Command<IntegerCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public IntegerCommandResult insertParameters(CommandParams commandParams) throws NegativeException {
        int ints = service.findKNumberInSequences(((FourthCommandData) commandParams).a);
        IntegerCommandResult intArrayCommandResult = new IntegerCommandResult();
        intArrayCommandResult.value = ints;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}
