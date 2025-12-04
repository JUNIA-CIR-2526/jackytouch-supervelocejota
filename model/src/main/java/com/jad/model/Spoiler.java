package com.jad.model;

import com.jad.share.ICar;
import java.util.Arrays;

public class Spoiler extends AbstractTuningPart {
    public Spoiler() {
        super("spoiler.txt", new AerodynamicEffect(), Arrays.asList(
            new AestheticEffect(),
            new AerodynamicEffect(),
            new ExaggeratedEffect()
        ));
    }
}
