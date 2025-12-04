package com.jad.share;

import java.util.List;

public interface ITuningPart {
    List<String> getAsciiArt();
    void setEffect(IMechanicalEffect effect);
    String getEffectDescription();
    List<IMechanicalEffect> getAvailableEffects();
}
