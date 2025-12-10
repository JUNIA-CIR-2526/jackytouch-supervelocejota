package com.jad.model;

public class DecoratorRims extends DecoratorTuningPart {
    private final BehaviorRims behavior;

    public DecoratorRims() {
        super("rims.txt", new BehaviorRims());
        this.behavior = new BehaviorRims();
        this.setEffect(this.behavior);
    }

    @Override
    public void nextSpecification() {
        this.behavior.nextSpecification();
    }
}
