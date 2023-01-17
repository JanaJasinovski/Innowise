package org.example.generator.impl;

import org.example.data.Integer3ValuesCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;

public class SixCommandParamGenerator implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        view.print("Enter first value: ");
        Integer3ValuesCommandData data = new Integer3ValuesCommandData();
        data.a = (view.getFirstIntValue());
        view.print("Enter second value: ");
        data.b = (view.getFirstIntValue());
        view.print("Enter third value: ");
        data.c = (view.getFirstIntValue());
        return data;
    }
}