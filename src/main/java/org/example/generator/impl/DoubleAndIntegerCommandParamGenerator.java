package org.example.generator.impl;

import org.example.data.DoubleValueIntegerValueCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;

public class DoubleAndIntegerCommandParamGenerator implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        view.print("Enter double value: ");
        DoubleValueIntegerValueCommandData data = new DoubleValueIntegerValueCommandData();
        data.a = view.getDoubleValue();
        view.print("Enter integer value: ");
        data.b = view.getFirstIntValue();
        return data;
    }
}
