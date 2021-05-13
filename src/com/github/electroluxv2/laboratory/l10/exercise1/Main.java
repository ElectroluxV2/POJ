package com.github.electroluxv2.laboratory.l10.exercise1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(final String[] args) {
        final String text = "Kiciuch Kiciuch Kiciuch kicikici kotek";
        var result = Main.countWords(text);
        result.forEach((word, integer) -> System.out.printf("%s -> %d%n", word, integer));
    }

    public static Map<String, Integer> countWords(final String text) {
        final Map<String, Integer> words = new HashMap<>();
        for (String word : text.split(" ")) {
            words.compute(word, (k, v) -> v == null ? 1 : v + 1);
        }

        return words;
    }
}
