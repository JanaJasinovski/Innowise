package org.example.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.params.CommandParams;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Integer3ValuesCommandData implements CommandParams {
    public int a;
    public int b;
    public int c;
}
