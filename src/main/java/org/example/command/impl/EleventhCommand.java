package org.example.command.impl;

import main.model.impl.ServiceImpl;
import org.example.command.Command;
import org.example.data.FirstCommandData;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntArrayCommandResult;

public class EleventhCommand implements Command<IntArrayCommandResult> {

    Service service = new ServiceImpl();

    @Override
    public IntArrayCommandResult insertParameters(CommandParams commandParams) throws Exception {
        int[] allCommonMultiplesLessMAndN = service.getAllCommonMultiplesLessMAndN(
                ((FirstCommandData) commandParams).a,
                ((FirstCommandData) commandParams).b);
        IntArrayCommandResult intArrayCommandResult = new IntArrayCommandResult();
        intArrayCommandResult.intArray = allCommonMultiplesLessMAndN;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntArrayCommandResult> getType() {
        return IntArrayCommandResult.class;
    }
}
