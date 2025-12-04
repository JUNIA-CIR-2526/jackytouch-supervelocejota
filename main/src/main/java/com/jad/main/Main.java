package com.jad.main;

import com.jad.controller.GarageController;
import com.jad.model.*;
import com.jad.textwindow.TextWindow;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextWindow textWindow = new TextWindow();
        textWindow.setVisible(true);

        GarageController controller = new GarageController();

        Spoiler spoiler = new Spoiler();
        Neon neon = new Neon();
        Rims rims = new Rims();
        Exhaust exhaust = new Exhaust();

        controller.changeSetting(spoiler, new ExaggeratedEffect());
     
        controller.changeSetting(rims, new PerformanceEffect());
        controller.changeSetting(exhaust, new SportEffect());

        controller.addTuning(spoiler);
        controller.addTuning(exhaust);
        controller.addTuning(rims);

        List<String> carAscii = controller.getRenderedCar();
        List<String> effects = controller.getEffectDescriptions();

        StringBuilder sb = new StringBuilder();
        sb.append(String.join("\n", carAscii));
        sb.append("\n\n");
        sb.append(String.join("\n", effects));

        textWindow.display(sb.toString());
    }
}
