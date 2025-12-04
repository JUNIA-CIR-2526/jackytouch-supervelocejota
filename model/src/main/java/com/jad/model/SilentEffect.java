package com.jad.model;

import com.jad.share.IMechanicalEffect;

public class SilentEffect implements IMechanicalEffect {
    @Override
    public String getDescription() {
        return "> bruit discret";
    }
}
