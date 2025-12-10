package com.jad.model;

public class DecoratorNeon extends DecoratorTuningPart {
    private final BehaviorNeon behavior;

    public DecoratorNeon() {
        super("neon.txt", new BehaviorNeon());
        this.behavior = new BehaviorNeon();
        this.setEffect(this.behavior);
    }

    public void nextSpecification() {
        this.behavior.nextSpecification();
    }
}
