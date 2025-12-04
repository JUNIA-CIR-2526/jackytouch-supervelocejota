package com.jad.model;

import com.jad.share.ICar;
import com.jad.share.IMechanicalEffect;
import com.jad.share.ITuningPart;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTuningPart implements ITuningPart, ICar {
    private List<String> asciiArt;
    private IMechanicalEffect effect;
    private List<IMechanicalEffect> availableEffects;
    private ICar decoratedCar;

    public AbstractTuningPart(String fileName, IMechanicalEffect defaultEffect, List<IMechanicalEffect> availableEffects) {
        this.asciiArt = AsciiLoader.load(fileName);
        this.effect = defaultEffect;
        this.availableEffects = availableEffects;
    }

    @Override
    public List<String> getAsciiArt() {
        List<String> baseAscii = this.decoratedCar.getAsciiArt();
        if (baseAscii == null || baseAscii.isEmpty()) {
            return new ArrayList<>();
        }

        int height = baseAscii.size();
        int width = 0;
        for (String line : baseAscii) {
            if (line.length() > width) {
                width = line.length();
            }
        }

        char[][] canvas = new char[height][width];

        // Initialize canvas with base car
        for (int y = 0; y < height; y++) {
            String line = baseAscii.get(y);
            for (int x = 0; x < width; x++) {
                if (x < line.length()) {
                    canvas[y][x] = line.charAt(x);
                } else {
                    canvas[y][x] = ' ';
                }
            }
        }

        // Overlay this part
        for (int y = 0; y < this.asciiArt.size() && y < height; y++) {
            String line = this.asciiArt.get(y);
            for (int x = 0; x < line.length() && x < width; x++) {
                char c = line.charAt(x);
                if (c != '.') { // '.' is transparent
                    canvas[y][x] = c;
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (int y = 0; y < height; y++) {
            result.add(new String(canvas[y]));
        }
        return result;
    }

    public void setDecoratedCar(ICar decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public List<String> getEffects() {
        List<String> effects = this.decoratedCar.getEffects();
        effects.add(this.getClass().getSimpleName() + ": " + this.getEffectDescription());
        return effects;
    }

    @Override
    public void setEffect(IMechanicalEffect effect) {
        this.effect = effect;
    }

    @Override
    public String getEffectDescription() {
        return this.effect != null ? this.effect.getDescription() : "Aucun effet";
    }

    @Override
    public List<IMechanicalEffect> getAvailableEffects() {
        return this.availableEffects;
    }
}
