package org.example.command.impl;

import org.example.command.Command;
import org.example.data.DoubleValueCommandData;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.BooleanCommandResult;

public class BooleanCommandForIsAmongFirstThreeDigitsOfFractionalPart0Method implements Command<BooleanCommandResult> {
    Service service = new ServiceImpl();
    @Override
    public BooleanCommandResult insertParametersIntoVariousMethods(CommandParams commandParams) throws Exception {
        boolean amongFirstThreeDigitsOfFractionalPart0 = service.isAmongFirstThreeDigitsOfFractionalPart0(
                ((DoubleValueCommandData) commandParams).a);
        BooleanCommandResult booleanCommandResult = new BooleanCommandResult();
        booleanCommandResult.value = amongFirstThreeDigitsOfFractionalPart0;
        return booleanCommandResult;
    }

    @Override
    public Class<BooleanCommandResult> getType() {
        return BooleanCommandResult.class;
    }
}
