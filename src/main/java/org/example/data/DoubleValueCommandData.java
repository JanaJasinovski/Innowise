package org.example.data;

import lombok.*;
import org.example.params.CommandParams;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoubleValueCommandData implements CommandParams {
    public double a;
}
