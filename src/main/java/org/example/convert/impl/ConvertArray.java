package org.example.convert.impl;


import org.example.convert.CommandResultConverter;
import org.example.result.CommandResult;
import org.example.result.impl.IntArrayCommandResult;

import java.util.Arrays;
public class ConvertArray implements CommandResultConverter {
    @Override
    public String convert(CommandResult commandResult) {
        int[] ints = ((IntArrayCommandResult) commandResult).intArray;
        return Arrays.toString(ints);
    }
}
