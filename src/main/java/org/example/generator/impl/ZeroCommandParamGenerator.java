package org.example.generator.impl;

import org.example.data.Integer3ValuesCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;

public class ZeroCommandParamGenerator implements ParamGenerator {
    @Override
    public CommandParams generateParam() {
        Integer3ValuesCommandData data = new Integer3ValuesCommandData();

        return null;
    }
}
