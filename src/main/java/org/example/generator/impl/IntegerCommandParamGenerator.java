package org.example.generator.impl;

import org.example.data.IntegerValueCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;

public class IntegerCommandParamGenerator implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        view.print("Enter integer value: ");
        IntegerValueCommandData data = new IntegerValueCommandData();
        data.a = view.getFirstIntValue();
        return data;
    }
}
