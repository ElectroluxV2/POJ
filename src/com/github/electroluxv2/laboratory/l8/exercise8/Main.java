package com.github.electroluxv2.laboratory.l8.exercise8;

import java.util.Arrays;

public class Main {

    public static void main(final String[] args) {
        final Student[] students = new Student[] {
            new Student("NieAndrzej", "NiePiaseczny", "s54321"),
            new Student("Andrzej", "Piaseczny", "s12345"),
        };

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
    }
}
