package com.github.electroluxv2.laboratory.l5.Exercise7;

import java.util.Objects;

class Human {
    protected static final String power = "None";

    private final String name;
    private final int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPower() {
        return Human.power;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (!(other instanceof final Human otherHuman)) return false;

        // Power check
        final String otherPower = other instanceof SuperHuman ? otherHuman.getPower() : Human.power;

        return this.getPower().equals(otherPower) && this.age == otherHuman.age && this.name.equals(otherHuman.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
