package com.jad.model;

import com.jad.share.ICar;
import java.util.Arrays;

public class Exhaust extends AbstractTuningPart {
    public Exhaust() {
        super("exhaust.txt", new SilentEffect(), Arrays.asList(
            new SilentEffect(),
            new SportEffect(),
            new DragEffect()
        ));
    }
}
