package com.jad.model;

import com.jad.share.ICar;
import java.util.ArrayList;
import java.util.List;

public class CarBase implements ICar {
    private List<String> asciiArt;

    public CarBase() {
        this.asciiArt = AsciiLoader.load("car_base.txt");
    }

    @Override
    public List<String> getAsciiArt() {
        return new ArrayList<>(asciiArt);
    }

    @Override
    public List<String> getEffects() {
        return new ArrayList<>();
    }
}
