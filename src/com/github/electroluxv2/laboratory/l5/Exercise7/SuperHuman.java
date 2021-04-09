package com.github.electroluxv2.laboratory.l5.Exercise7;

import java.util.Objects;

final class SuperHuman extends Human {
    private final String power;

    public SuperHuman(final String name, final int age, final String power) {
        super(name, age);
        this.power = power;
    }

    @Override
    public final String getPower() {
        return power;
    }

    // To chyba będzie anitpatern, że używam SuperHuman w Human zamiast rozpatrzyć to osobno
    /* @Override
    public boolean equals(Object o) {
        return super.equals(o);
    } */

    @Override
    public final int hashCode() {
        return Objects.hash(super.hashCode(), power);
    }
}
