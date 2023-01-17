package org.example.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.params.CommandParams;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoubleValueIntegerValueCommandData implements CommandParams {
    public double a;
    public int b;
}
