package org.example.data;

import lombok.*;
import org.example.params.CommandParams;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IntegerValueCommandData implements CommandParams {
    public int a;
}
