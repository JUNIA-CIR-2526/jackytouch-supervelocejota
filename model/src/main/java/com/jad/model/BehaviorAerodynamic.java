package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorAerodynamic implements IMechanicalBehavior {
    @Override
    public String getDescription() {
        return "> stabilité accrue";
    }
}
