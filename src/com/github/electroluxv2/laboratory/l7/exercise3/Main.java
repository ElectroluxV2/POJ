package com.github.electroluxv2.laboratory.l7.exercise3;

import java.util.StringJoiner;

public class Main {
    public static void main(final String[] args) {
        System.out.println(method(2, "Ala", "nie", "ma", "test", "kota i", "psa", "papugę"));
    }

    private static String method(int arg0, String... args) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1; i <= args.length; i++) {
           if (i % arg0 != 0) {
               stringJoiner.add(args[i - 1]);
           }
        }
        return stringJoiner.toString();
    }
}
