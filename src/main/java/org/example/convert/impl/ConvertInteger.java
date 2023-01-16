package org.example.convert.impl;

import org.example.convert.CommandResultConverter;
import org.example.result.CommandResult;
import org.example.result.impl.IntegerCommandResult;

public class ConvertInteger implements CommandResultConverter {
    @Override
    public String convert(CommandResult commandResult) {
        Integer ints = ((IntegerCommandResult) commandResult).value;
        return String.valueOf(ints);
    }
}
