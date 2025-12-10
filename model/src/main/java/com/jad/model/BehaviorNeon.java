package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorNeon implements IMechanicalBehavior {
    private enum Specification {
        SOBER("> lumière fixe"),
        DISCO("> clignotement simulé"),
        RANDOM("> affichage imprévisible");

        private final String description;

        Specification(String description) {
            this.description = description;
        }
    }

    private Specification specification = Specification.SOBER;

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
