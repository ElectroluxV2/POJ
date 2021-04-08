package com.github.electroluxv2.laboratory.l5.Exercise1;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "moew moew you crazy man";
    }

    @Override
    public String toString() {
        return "%s I'm cat, %s ".formatted(super.toString(), this.makeSound());
    }
}
