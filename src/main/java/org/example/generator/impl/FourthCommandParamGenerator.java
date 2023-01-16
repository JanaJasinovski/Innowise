package org.example.generator.impl;

import org.example.data.FourthCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;

public class FourthCommandParamGenerator implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        view.print("Enter integer value: ");
        FourthCommandData data = new FourthCommandData();
        data.a = view.getFirstIntValue();
        return data;
    }
}
