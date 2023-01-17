package org.example.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.params.CommandParams;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IntegerValueAndArrayCommandData implements CommandParams {
    public int a;
    public int[] array;
}
