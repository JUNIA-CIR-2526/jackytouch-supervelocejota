package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorExaggerated implements IMechanicalBehavior {
    @Override
    public String getDescription() {
        return "> vitesse max réduite, effet visuel accentué";
    }
}
