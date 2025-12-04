package com.jad.model;

import com.jad.share.ICar;
import java.util.Arrays;

public class Rims extends AbstractTuningPart {
    public Rims() {
        super("rims.txt", new ShowOffEffect(), Arrays.asList(
            new PerformanceEffect(),
            new LowCostEffect(),
            new ShowOffEffect()
        ));
    }
}
