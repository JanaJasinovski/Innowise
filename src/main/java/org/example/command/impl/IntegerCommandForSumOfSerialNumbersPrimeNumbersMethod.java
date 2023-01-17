package org.example.command.impl;

import lombok.AllArgsConstructor;
import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;

@AllArgsConstructor
public class IntegerCommandForSumOfSerialNumbersPrimeNumbersMethod implements Command<IntegerCommandResult> {
    private Service service;
    @Override
    public IntegerCommandResult execute(CommandParams commandParams) throws Exception {
        if(!(commandParams instanceof IntegerValueAndArrayCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        int allNNaturalDivisors = service.sumOfSerialNumbersPrimeNumbers(
                ((IntegerValueAndArrayCommandData) commandParams).a,
                ((IntegerValueAndArrayCommandData) commandParams).array
        );
        IntegerCommandResult integerCommandResult = new IntegerCommandResult();
        integerCommandResult.value = allNNaturalDivisors;
        return integerCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}
