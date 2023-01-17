package org.example.command.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.command.Command;
import org.example.data.DoubleValueCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.BooleanCommandResult;

@AllArgsConstructor
@NoArgsConstructor
public class BooleanCommandForIsAmongFirstThreeDigitsOfFractionalPart0Method implements Command<BooleanCommandResult> {
    private Service service;
    @Override
    public BooleanCommandResult execute(CommandParams commandParams) throws Exception {
        if(!(commandParams instanceof DoubleValueCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
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
