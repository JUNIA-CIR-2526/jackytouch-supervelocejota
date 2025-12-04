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
        
        // Create parts
        Spoiler spoiler = new Spoiler();
        Neon neon = new Neon();
        Rims rims = new Rims();
        Exhaust exhaust = new Exhaust();

        // Apply effects as per example
        controller.changeSetting(spoiler, new AerodynamicEffect());
        controller.changeSetting(neon, new DiscoEffect());
        controller.changeSetting(rims, new PerformanceEffect());
        controller.changeSetting(exhaust, new SportEffect());

        // Add parts to controller
        controller.addTuning(spoiler);
        controller.addTuning(neon);
        controller.addTuning(rims);
        controller.addTuning(exhaust);

        List<String> carAscii = controller.getRenderedCar();
        List<String> effects = controller.getEffectDescriptions();

        StringBuilder sb = new StringBuilder();
        sb.append(String.join("\n", carAscii));
        sb.append("\n\n");
        sb.append(String.join("\n", effects));

        textWindow.display(sb.toString());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Change setting to Drag
        controller.changeSetting(exhaust, new DragEffect());
        
        // Refresh display
        carAscii = controller.getRenderedCar();
        effects = controller.getEffectDescriptions();

        sb = new StringBuilder();
        sb.append(String.join("\n", carAscii));
        sb.append("\n\n");
        sb.append(String.join("\n", effects));

        textWindow.display(sb.toString());
    }
}
