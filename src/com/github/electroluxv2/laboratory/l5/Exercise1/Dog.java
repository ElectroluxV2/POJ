package com.github.electroluxv2.laboratory.l5.Exercise1;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "Wopf wopf";
    }

    @Override
    public String toString() {
        return "%s I'm dog, %s ".formatted(super.toString(), this.makeSound());
    }
}
