package org.example.generator.impl;

import org.example.data.FiveCommandData;
import org.example.generator.ParamGenerator;
import org.example.params.CommandParams;
import org.example.view.View;
public class FiveCommandParamGenerator implements ParamGenerator {
    View view = new View();
    @Override
    public CommandParams generateParam() {
        view.print("Enter size of array: ");
        FiveCommandData data = new FiveCommandData();
        data.a = view.getFirstIntValue();
        view.print("Enter elements of array: ");
        data.array = view.enterArray(data.a);
        return data;
    }
}