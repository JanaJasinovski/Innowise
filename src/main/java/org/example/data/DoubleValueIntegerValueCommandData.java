package org.example.data;

import org.example.params.CommandParams;

public class DoubleValueIntegerValueCommandData implements CommandParams {
    public double a;
    public int b;

    public DoubleValueIntegerValueCommandData() {
    }

    public DoubleValueIntegerValueCommandData(double a, int b) {
        this.a = a;
        this.b = b;
    }
}
