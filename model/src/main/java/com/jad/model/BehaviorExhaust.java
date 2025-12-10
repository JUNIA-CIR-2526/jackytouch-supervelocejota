package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorExhaust implements IMechanicalBehavior {
    private Specification specification = Specification.SILENT;

    public void nextSpecification() {
        int nextOrdinal = (this.specification.ordinal() + 1) % Specification.values().length;
        this.specification = Specification.values()[nextOrdinal];
    }

    @Override
    public String getDescription() {
        return this.specification.description;
    }

    private enum Specification {
        SILENT("> bruit discret"),
        SPORT("> bruit puissant"),
        DRAG("> bruit extrême");

        private final String description;

        Specification(String description) {
            this.description = description;
        }
    }
}
