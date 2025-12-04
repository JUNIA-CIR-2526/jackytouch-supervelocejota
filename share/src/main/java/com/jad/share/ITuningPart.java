package com.jad.share;

import java.util.List;

public interface ITuningPart extends ICar {
    List<String> getAsciiArt();
    void setEffect(IMechanicalEffect effect);
    String getEffectDescription();
    List<IMechanicalEffect> getAvailableEffects();
    void setDecoratedCar(ICar car);
}
