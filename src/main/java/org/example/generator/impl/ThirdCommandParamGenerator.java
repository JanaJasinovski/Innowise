package org.example.generator.impl;

import org.example.data.ThirdCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;

public class ThirdCommandParamGenerator implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        view.print("Enter double value: ");
        ThirdCommandData data = new ThirdCommandData();
        data.a = view.getDoubleValue();
        return data;
    }
}
