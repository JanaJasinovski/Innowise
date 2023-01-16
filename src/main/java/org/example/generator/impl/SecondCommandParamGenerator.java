package org.example.generator.impl;

import org.example.data.SecondCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;

public class SecondCommandParamGenerator  implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        view.print("Enter double value: ");
        SecondCommandData data = new SecondCommandData();
        data.a = view.getDoubleValue();
        view.print("Enter integer value: ");
        data.b = view.getFirstIntValue();
        return data;
    }
}
