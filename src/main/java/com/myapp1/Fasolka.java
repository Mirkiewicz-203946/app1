package com.myapp1;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class Fasolka {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int value;
}
