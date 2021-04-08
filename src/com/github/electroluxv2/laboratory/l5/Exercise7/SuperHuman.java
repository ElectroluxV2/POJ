package com.github.electroluxv2.laboratory.l5.Exercise7;

import java.util.Objects;

class SuperHuman extends Human {
    private final String power;

    public SuperHuman(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    @Override
    public String getPower() {
        return power;
    }

    // To chyba będzie anitpatern, że używam SuperHuman w Human zamiast rozpatrzyć to osobno
    /* @Override
    public boolean equals(Object o) {
        return super.equals(o);
    } */

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), power);
    }
}
