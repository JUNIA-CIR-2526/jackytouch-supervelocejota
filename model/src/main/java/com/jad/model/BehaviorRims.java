package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorRims implements IMechanicalBehavior {
    private enum Specification {
        PERFORMANCE("> accélération améliorée"),
        LOW_COST("> aucun effet"),
        SHOW_OFF("> bruit distinctif");

        private final String description;

        Specification(String description) {
            this.description = description;
        }
    }

    private Specification specification = Specification.PERFORMANCE;

    public void setSpecification(Specification spec) {
        this.specification = spec;
    }

    public void nextSpecification() {
        int nextOrdinal = (this.specification.ordinal() + 1) % Specification.values().length;
        this.specification = Specification.values()[nextOrdinal];
    }

    @Override
    public String getDescription() {
        return this.specification.description;
    }
}
