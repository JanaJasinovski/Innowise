package org.example.generator.impl;

import org.example.data.DoubleValueCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;

public class DoubleCommandParamGenerator implements ParamGenerator {
    private final View view = new View();
    @Override
    public CommandParams generateParam() {
        view.print("Enter double value: ");
        DoubleValueCommandData data = new DoubleValueCommandData();
        data.setA(view.getDoubleValue());
        return data;
    }
}
