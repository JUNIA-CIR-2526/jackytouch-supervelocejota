package com.jad.main;

import com.jad.controller.Controller;
import com.jad.model.*;
import com.jad.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();

        Controller controller = new Controller();

        DecoratorSpoiler spoiler = new DecoratorSpoiler();
        DecoratorNeon neon = new DecoratorNeon();
        DecoratorRims rims = new DecoratorRims();
        DecoratorExhaust exhaust = new DecoratorExhaust();

        controller.addTuning(neon);
        controller.addTuning(rims);
        controller.addTuning(exhaust);
        controller.addTuning(spoiler);

        view.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                int key = e.getKeyCode();
                if (key == java.awt.event.KeyEvent.VK_UP) {
                    spoiler.nextSpecification();
                } else if (key == java.awt.event.KeyEvent.VK_DOWN) {
                    exhaust.nextSpecification();
                } else if (key == java.awt.event.KeyEvent.VK_LEFT) {
                    rims.nextSpecification();
                } else if (key == java.awt.event.KeyEvent.VK_RIGHT) {
                    neon.nextSpecification();
                }
                view.displayCar(controller.getRenderedCar());
                view.displayLog(controller.getEffectDescriptions());
            }
        });

        view.displayCar(controller.getRenderedCar());
        view.displayLog(controller.getEffectDescriptions());
    }
}
