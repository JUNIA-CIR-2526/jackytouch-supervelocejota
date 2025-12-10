package com.jad.model;

import com.jad.share.IMechanicalBehavior;

public class BehaviorSpoiler implements IMechanicalBehavior {
    private enum Specification {
        AESTHETIC("> aucun effet mécanique"),
        AERODYNAMIC("> stabilité accrue"),
        EXAGGERATED("> vitesse max réduite, effet visuel accentué");

        private final String description;

        Specification(String description) {
            this.description = description;
        }
    }

    private Specification specification = Specification.AESTHETIC;

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
