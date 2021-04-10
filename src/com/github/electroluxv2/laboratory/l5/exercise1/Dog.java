package com.github.electroluxv2.laboratory.l5.exercise1;

final class Dog extends Animal {

    public Dog(final String name, final String color) {
        super(name, color);
    }

    @Override
    public final String makeSound() {
        return "Wopf wopf";
    }

    @Override
    public final String toString() {
        return "%s I'm dog, %s ".formatted(super.toString(), this.makeSound());
    }
}
