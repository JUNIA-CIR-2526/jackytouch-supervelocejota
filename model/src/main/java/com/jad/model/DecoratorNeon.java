package com.jad.model;

import java.util.Arrays;

public class DecoratorNeon extends DecoratorTuningPart {
    public DecoratorNeon() {
        super("neon.txt", new BehaviorShowOff(), Arrays.asList(
                new BehaviorSober(),
                new BehaviorDisco(),
                new BehaviorRandom()));
    }
}
