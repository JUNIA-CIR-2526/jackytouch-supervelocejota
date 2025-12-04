package com.jad.controller;

import com.jad.model.CarBase;
import com.jad.share.ICar;
import com.jad.share.IMechanicalEffect;
import com.jad.share.ITuningPart;

import java.util.ArrayList;
import java.util.List;

public class GarageController {
    private ICar car;
    private List<ITuningPart> installedParts = new ArrayList<>();

    public GarageController() {
        this.car = CarBase.getInstance();
    }

    public void addTuning(ITuningPart part) {
        this.installedParts.add(part);
    }

    public void changeSetting(ITuningPart part, IMechanicalEffect newEffect) {
        part.setEffect(newEffect);
    }

    public List<String> getRenderedCar() {
        // We need to render the top of the chain.
        // If we have a list, we need to chain them dynamically or maintain a `root` car.
        // Dynamic chaining:
        ICar current = CarBase.getInstance();
        for (ITuningPart part : installedParts) {
             if (part instanceof com.jad.model.AbstractTuningPart) {
                 ((com.jad.model.AbstractTuningPart) part).setDecoratedCar(current);
                 current = (ICar) part;
             }
        }
        return current.getAsciiArt();
    }

    public List<String> getEffectDescriptions() {
        // Same dynamic chaining for effects?
        // Or just ask the top one?
        // The top one calls the bottom ones.
        // So if we built the chain in getRenderedCar, we should store the result or rebuild.
        ICar current = CarBase.getInstance();
        for (ITuningPart part : installedParts) {
             if (part instanceof com.jad.model.AbstractTuningPart) {
                 ((com.jad.model.AbstractTuningPart) part).setDecoratedCar(current);
                 current = (ICar) part;
             }
        }
        return current.getEffects();
    }
}
