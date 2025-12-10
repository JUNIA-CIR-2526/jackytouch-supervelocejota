package com.jad.controller;

import com.jad.model.CarBase;
import com.jad.share.ICar;
import com.jad.share.IMechanicalBehavior;
import com.jad.share.ITuningPart;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private ICar car;
    private List<ITuningPart> installedParts = new ArrayList<>();

    public Controller() {
        this.car = new CarBase();
    }

    public void addTuning(ITuningPart part) {
        this.installedParts.add(part);
    }

    public void changeSetting(ITuningPart part, IMechanicalBehavior newEffect) {
        part.setEffect(newEffect);
    }

    public List<String> getRenderedCar() {
        return this.buildCarChain().getAsciiArt();
    }

    public List<String> getEffectDescriptions() {
        return this.buildCarChain().getEffects();
    }

    private ICar buildCarChain() {
        ICar current = this.car;
        for (int i = 0; i < this.installedParts.size(); i++) {
            ITuningPart part = this.installedParts.get(i);
            part.setDecoratedCar(current);
            current = part;
        }
        return current;
    }
}
