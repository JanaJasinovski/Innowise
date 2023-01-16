package org.example.generator.impl;

import org.example.data.IntegerValueAndArrayCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;

public class IntegerAndArrayCommandParamGenerator implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        view.print("Enter size of array: ");
        IntegerValueAndArrayCommandData data = new IntegerValueAndArrayCommandData();
        data.a = view.getFirstIntValue();
        view.print("Enter elements of array: ");
        data.array = view.enterArray(data.a);
        return data;
    }
}