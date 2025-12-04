package com.jad.model;

import com.jad.share.ICar;
import java.util.ArrayList;
import java.util.List;

public class CarBase implements ICar {
    private static CarBase instance;
    private List<String> asciiArt;

    private CarBase() {
        this.asciiArt = AsciiLoader.load("car_base.txt");
    }

    public static CarBase getInstance() {
        if (instance == null) {
            instance = new CarBase();
        }
        return instance;
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
