package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorAesthetic implements IMechanicalBehavior {
    @Override
    public String getDescription() {
        return "> aucun effet mécanique";
    }
}
