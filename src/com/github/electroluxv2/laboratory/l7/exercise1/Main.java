package com.github.electroluxv2.laboratory.l7.exercise1;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name, lastname, birth date:");
        final Person person = Main.createPerson(scanner);
        System.out.println(person);
    }

    private static Person createPerson(final Scanner scanner) {
        try {
            return new Person(scanner.next(), scanner.next(), scanner.next());
        } catch (IllegalArgumentException e) {
            System.out.printf("Invalid data! '%s' Enter again%n", e.getMessage());
            return Main.createPerson(scanner);
        }
    }
}
