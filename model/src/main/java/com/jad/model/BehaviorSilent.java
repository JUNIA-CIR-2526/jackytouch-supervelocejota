package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorSilent implements IMechanicalBehavior {
    @Override
    public String getDescription() {
        return "> bruit discret";
    }
}
