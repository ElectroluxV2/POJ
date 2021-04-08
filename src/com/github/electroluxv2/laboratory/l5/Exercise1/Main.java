package com.github.electroluxv2.laboratory.l5.Exercise1;

public class Main {

    public static void main(String[] args) {
        final Cat cat = new Cat("Robert", "Black");
        final Dog dog = new Dog("Artur", "White");

        System.out.println(cat.makeSound());
        System.out.println(cat);

        System.out.println(dog.makeSound());
        System.out.println(dog);
    }
}