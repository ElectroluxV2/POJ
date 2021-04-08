package com.github.electroluxv2.laboratory.l5.Exercise7;

class Main {

    public static void main(String[] args) {
        final Human human = new Human("Robert", 36);
        final Human human2 = new Human("Robert", 36);
        final SuperHuman superHuman = new SuperHuman("Robert", 36, "None");
        final SuperHuman superHuman2 = new SuperHuman("Robert", 36, "None");
        final SuperHuman superHuman3 = new SuperHuman("Robert", 36, "Fly");

        System.out.printf("Human to SuperHuman: %b%n", human.equals(superHuman));
        System.out.printf("SuperHuman to Human: %b%n", superHuman.equals(human));

        System.out.printf("SuperHuman2 to SuperHuman: %b%n", superHuman2.equals(superHuman));
        System.out.printf("Human2 to Human: %b%n", human2.equals(human));

        System.out.printf("SuperHuman3 to Human: %b%n", superHuman3.equals(human));
        System.out.printf("SuperHuman3 to SuperHuman2: %b%n", superHuman3.equals(superHuman2));
        System.out.printf("SuperHuman3 to SuperHuman3: %b%n", superHuman3.equals(superHuman3));
    }
}
