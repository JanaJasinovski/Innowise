package org.example.command.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.command.Command;
import org.example.data.IntegerValueAndArrayCommandData;
import org.example.exception.ValueCommandDataException;
import org.example.model.Service;
import org.example.params.CommandParams;
import org.example.result.impl.IntegerCommandResult;

@AllArgsConstructor
@NoArgsConstructor
public class IntegerCommandForFindColNumbersInLongestSubsequenceNumbersSortedASCMethod implements Command<IntegerCommandResult> {
    private Service service;
    @Override
    public IntegerCommandResult execute(CommandParams commandParams) throws Exception {
        if(!(commandParams instanceof IntegerValueAndArrayCommandData)) {
            throw new ValueCommandDataException("incorrect command parameters");
        }
        int allNNaturalDivisors = service.findColNumbersInLongestSubsequenceNumbersSortedASC(
                ((IntegerValueAndArrayCommandData) commandParams).a,
                ((IntegerValueAndArrayCommandData) commandParams).array);
        IntegerCommandResult intArrayCommandResult = new IntegerCommandResult();
        intArrayCommandResult.value = allNNaturalDivisors;
        return intArrayCommandResult;
    }

    @Override
    public Class<IntegerCommandResult> getType() {
        return IntegerCommandResult.class;
    }
}
