package com.jad.model;

import com.jad.share.IMechanicalEffect;

public class ExaggeratedEffect implements IMechanicalEffect {
    @Override
    public String getDescription() {
        return "> vitesse max réduite, effet visuel accentué";
    }
}
