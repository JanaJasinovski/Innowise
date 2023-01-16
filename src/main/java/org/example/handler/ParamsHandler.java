package org.example.handler;

import org.example.generator.ParamGenerator;
import org.example.generator.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ParamsHandler {
    public Map<Integer, ParamGenerator> map;

    public ParamsHandler() {
        this.map = new HashMap<>();
    }

    private Map<Integer, ParamGenerator> getMap() {
        map.put(1, new TwoIntegersCommandParamGenerator());
        map.put(2, new DoubleAndIntegerCommandParamGenerator());
        map.put(3, new DoubleCommandParamGenerator());
        map.put(4, new DoubleCommandParamGenerator());
        map.put(5, new IntegerCommandParamGenerator());
        map.put(6, new IntegerCommandParamGenerator());
        map.put(7, new IntegerCommandParamGenerator());
        map.put(8, new IntegerCommandParamGenerator());
        map.put(9, new IntegerCommandParamGenerator());
        map.put(10, new TwoIntegersCommandParamGenerator());
        map.put(11, new TwoIntegersCommandParamGenerator());
        map.put(12, new IntegerCommandParamGenerator());
        map.put(13, new IntegerAndArrayCommandParamGenerator());
        map.put(14, new IntegerAndArrayCommandParamGenerator());
        map.put(15, new IntegerAndArrayCommandParamGenerator());
        map.put(16, new ZeroCommandParamGenerator());
        map.put(17, new ZeroCommandParamGenerator());
        map.put(18, new IntegerCommandParamGenerator());
        map.put(19, new IntegerCommandParamGenerator());
        map.put(20, new DoubleAndIntegerCommandParamGenerator());
        map.put(21, new SixCommandParamGenerator());
        map.put(22, new TwoIntegersCommandParamGenerator());
        map.put(23, new IntegerAndArrayCommandParamGenerator());
        map.put(24, new IntegerCommandParamGenerator());
        return map;
    }

    public ParamGenerator getParam(int number) {
        return getMap().get(number);
    }
}

