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

        controller.changeSetting(spoiler, new BehaviorExaggerated());
        controller.changeSetting(neon, new BehaviorDisco());
        controller.changeSetting(rims, new BehaviorPerformance());
        controller.changeSetting(exhaust, new BehaviorSport());

        controller.addTuning(neon);
        controller.addTuning(exhaust);
        controller.addTuning(rims);
        controller.addTuning(spoiler);

        view.displayCar(controller.getRenderedCar());
        view.displayLog(controller.getEffectDescriptions());
    }
}
