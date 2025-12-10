package com.jad.model;

public class DecoratorExhaust extends DecoratorTuningPart {
    private final BehaviorExhaust behavior;

    public DecoratorExhaust() {
        super("exhaust.txt", new BehaviorExhaust());
        this.behavior = new BehaviorExhaust();
        this.setEffect(this.behavior);
    }

    @Override
    public void nextSpecification() {
        this.behavior.nextSpecification();
    }
}
