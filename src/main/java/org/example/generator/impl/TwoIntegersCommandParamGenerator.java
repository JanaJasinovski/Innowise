package org.example.generator.impl;

import org.example.data.Integer2ValuesCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;

public class TwoIntegersCommandParamGenerator implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        System.out.println("Enter integer value: ");
        Integer2ValuesCommandData data = new Integer2ValuesCommandData();
        data.setA(view.getFirstIntValue());
        System.out.println("Enter integer value: ");
        data.setB(view.getFirstIntValue());
        return data;
    }
}
