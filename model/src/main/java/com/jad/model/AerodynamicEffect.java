package com.jad.model;

import com.jad.share.IMechanicalEffect;

public class AerodynamicEffect implements IMechanicalEffect {
    @Override
    public String getDescription() {
        return "> stabilité accrue";
    }
}
