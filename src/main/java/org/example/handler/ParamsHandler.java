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
        map.put(1, new FirstCommandParamGenerator());
        map.put(2, new SecondCommandParamGenerator());
        map.put(3, new ThirdCommandParamGenerator());
        map.put(4, new ThirdCommandParamGenerator());
        map.put(5, new FourthCommandParamGenerator());
        map.put(6, new FourthCommandParamGenerator());
        map.put(7, new FourthCommandParamGenerator());
        map.put(8, new FourthCommandParamGenerator());
        map.put(9, new FourthCommandParamGenerator());
        map.put(10, new FirstCommandParamGenerator());
        map.put(11, new FirstCommandParamGenerator());
        map.put(12, new FourthCommandParamGenerator());
        map.put(13, new FiveCommandParamGenerator());
        map.put(14, new FiveCommandParamGenerator());
        map.put(15, new FiveCommandParamGenerator());
        map.put(16, new ZeroCommandParamGenerator());
        map.put(17, new ZeroCommandParamGenerator());
        map.put(18, new FourthCommandParamGenerator());
        map.put(19, new FourthCommandParamGenerator());
        map.put(20, new SecondCommandParamGenerator());
        map.put(21, new SixCommandParamGenerator());
        map.put(22, new FirstCommandParamGenerator());
        map.put(23, new FiveCommandParamGenerator());
        map.put(24, new FourthCommandParamGenerator());
        return map;
    }

    public ParamGenerator getParam(int number) {
        return getMap().get(number);
    }
}

