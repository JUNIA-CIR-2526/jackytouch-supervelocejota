package com.jad.model;

import java.util.Arrays;

public class DecoratorExhaust extends DecoratorTuningPart {
    public DecoratorExhaust() {
        super("exhaust.txt", new BehaviorSilent(), Arrays.asList(
                new BehaviorSilent(),
                new BehaviorSport(),
                new BehaviorDrag()));
    }
}
