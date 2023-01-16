package org.example.handler;

import org.example.convert.CommandResultConverter;
import org.example.convert.impl.*;

import java.util.HashMap;
import java.util.Map;

public class TypeHandler {
    private final Map<Class<?>, CommandResultConverter> map;
    public TypeHandler() {
        this.map = new HashMap<>();
    }
    private Map<Class<?>, CommandResultConverter> getMap() {
        map.put(int[].class, new ConvertArray());
        map.put(Integer.class, new ConvertInteger());
        map.put(Boolean.class, new ConvertBoolean());
        return map;
    }
    public CommandResultConverter getHandler(Class<?> type) {
        return getMap().get(type);
    }
}
