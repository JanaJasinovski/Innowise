package org.example.convert.impl;

import org.example.convert.CommandResultConverter;
import org.example.result.CommandResult;
import org.example.result.impl.BooleanCommandResult;

public class ConvertBoolean implements CommandResultConverter {
    @Override
    public String convert(CommandResult commandResult) {
        Boolean boolValue = ((BooleanCommandResult) commandResult).value;
        return String.valueOf(boolValue);
    }
}
