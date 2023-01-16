package org.example.generator.impl;

import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;

public class ZeroCommandParamGenerator implements ParamGenerator {
    @Override
    public CommandParams generateParam() {
        return null;
    }
}
