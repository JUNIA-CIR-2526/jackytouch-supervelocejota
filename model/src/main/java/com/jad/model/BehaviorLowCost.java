package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorLowCost implements IMechanicalBehavior {
    @Override
    public String getDescription() {
        return "> aucun effet";
    }
}
