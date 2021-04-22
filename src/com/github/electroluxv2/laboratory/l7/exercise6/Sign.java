package com.github.electroluxv2.laboratory.l7.exercise6;

import java.util.Set;

public enum Sign {
    CONSONANT,
    VOWEL,
    SPACE,
    NUMBER;

    private static final Set<Character> VOWELS = Set.of('a', 'ą', 'e', 'ę', 'i', 'o', 'u', 'y');

    public static boolean is(char c, Sign type) {
        return switch (type) {
            case SPACE -> c == ' ';
            case NUMBER -> Character.isDigit(c);
            case VOWEL -> VOWELS.contains(Character.toLowerCase(c));
            case CONSONANT -> !VOWELS.contains(Character.toLowerCase(c)) && !Character.isDigit(c) && c != ' ';
        };
    }
}
