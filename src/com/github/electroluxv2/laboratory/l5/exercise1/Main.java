package com.github.electroluxv2.laboratory.l5.exercise1;

class Main {

    public static void main(final String[] args) {
        final Cat cat = new Cat("Robert", "Black");
        final Dog dog = new Dog("Artur", "White");

        System.out.println(cat.makeSound());
        System.out.println(cat);

        System.out.println(dog.makeSound());
        System.out.println(dog);
    }
}
