package com.jad.model;

import java.util.Arrays;

public class DecoratorRims extends DecoratorTuningPart {
    public DecoratorRims() {
        super("rims.txt", new BehaviorShowOff(), Arrays.asList(
                new BehaviorPerformance(),
                new BehaviorLowCost(),
                new BehaviorShowOff()));
    }
}
