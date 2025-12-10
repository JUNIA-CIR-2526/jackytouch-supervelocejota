package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorDisco implements IMechanicalBehavior {
    @Override
    public String getDescription() {
        return "> clignotement simulé";
    }
}
