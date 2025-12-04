package com.jad.model;

import com.jad.share.ICar;
import java.util.Arrays;

public class Neon extends AbstractTuningPart {
    public Neon() {
        super("neon.txt", new ShowOffEffect(), Arrays.asList(
            new SoberEffect(),
            new DiscoEffect(),
            new RandomEffect()
        ));
    }
}
