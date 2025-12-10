package com.jad.model;

public class DecoratorSpoiler extends DecoratorTuningPart {
    private final BehaviorSpoiler behavior;

    public DecoratorSpoiler() {
        super("spoiler.txt", new BehaviorSpoiler());
        this.behavior = new BehaviorSpoiler();
        this.setEffect(this.behavior);
    }

    @Override
    public void nextSpecification() {
        this.behavior.nextSpecification();
    }
}
