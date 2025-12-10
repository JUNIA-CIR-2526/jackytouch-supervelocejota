package com.jad.share;

import java.util.List;

public interface ITuningPart extends ICar {
    List<String> getAsciiArt();

    void setEffect(IMechanicalBehavior effect);

    String getEffectDescription();

    List<IMechanicalBehavior> getAvailableEffects();

    void setDecoratedCar(ICar car);
}
