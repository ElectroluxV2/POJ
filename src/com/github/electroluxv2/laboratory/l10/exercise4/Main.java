package com.github.electroluxv2.laboratory.l10.exercise4;

import java.util.*;

public class Main {

    public static void main(final String[] args) {
        final List<Integer> integers = List.of(1, 2, 3, 3, 4, 5, 5, 5, 6);
        System.out.println(Main.makeUnique(integers));
    }

    public static <T> List<T> makeUnique(final List<T> original) {
        return List.copyOf(new LinkedHashSet<T>(original));
    }
}
