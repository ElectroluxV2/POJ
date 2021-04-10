package com.github.electroluxv2.laboratory.l5.exercise1;

final class Cat extends Animal {

    public Cat(final String name, final String color) {
        super(name, color);
    }

    @Override
    public final String makeSound() {
        return "moew moew you crazy man";
    }

    @Override
    public final String toString() {
        return "%s I'm cat, %s ".formatted(super.toString(), this.makeSound());
    }
}
