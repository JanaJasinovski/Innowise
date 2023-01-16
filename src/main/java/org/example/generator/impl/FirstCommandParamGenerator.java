package org.example.generator.impl;

import org.example.data.FirstCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;
public class FirstCommandParamGenerator implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        System.out.println("Enter integer value: ");
        FirstCommandData data = new FirstCommandData();
        data.a = view.getFirstIntValue();
        System.out.println("Enter integer value: ");
        data.b = view.getFirstIntValue();
        return data;
    }
}
