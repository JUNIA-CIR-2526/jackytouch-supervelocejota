package com.jad.share;

import java.util.List;

public interface ITuningPart extends ICar {
    List<String> getAsciiArt();

    void setEffect(IMechanicalBehavior effect);

    String getEffectDescription();

    void setDecoratedCar(ICar car);
}
