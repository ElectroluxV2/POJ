package com.github.electroluxv2.laboratory.l5.exercise1;

// Package scope
abstract class Animal {
    private final String name;
    private final String color;

    protected Animal(final String name, final String color) {
        this.name = name;
        this.color = color;
    }

    abstract public String makeSound();

    @Override
    public String toString() {
        return "My name is %s, and my color is %s".formatted(this.name, this.color);
    }
}
