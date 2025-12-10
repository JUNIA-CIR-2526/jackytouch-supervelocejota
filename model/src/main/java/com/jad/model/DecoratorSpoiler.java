package com.jad.model;

import java.util.Arrays;

public class DecoratorSpoiler extends DecoratorTuningPart {
    public DecoratorSpoiler() {
        super("spoiler.txt", new BehaviorAerodynamic(), Arrays.asList(
                new BehaviorAesthetic(),
                new BehaviorAerodynamic(),
                new BehaviorExaggerated()));
    }
}
