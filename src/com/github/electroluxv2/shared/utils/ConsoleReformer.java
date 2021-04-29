package com.github.electroluxv2.shared.utils;

import java.util.HashMap;
import java.util.StringJoiner;

public enum ConsoleReformer {
    CURSOR_UP("A", 'u'),
    FOREGROUND_RED("31", '4'),
    FOREGROUND_GREED("32", '2'),
    FOREGROUND_BLUE("34", '1');

    private final String value;
    private final Character shorthand;
    private final static HashMap<Character, ConsoleReformer> shorthands = new HashMap<>();

    ConsoleReformer(final String value, final Character shorthand) {
        this.value = value;
        this.shorthand = shorthand;
    }

    public void flush() {
        System.out.printf("\u001B[%sm", this.value);
    }

    public static String clearFormatting(final String string) {
        return "";
    }

    public static String translateCodes(final String string) {
        final StringJoiner stringJoiner = new StringJoiner("");

        for (int i = 1; i < string.length(); i++) {
            final char c1 = string.charAt(i - 1);
            final char c2 = string.charAt(i);

            if (c1 != '&') {
                // if (c2 == '&') { i++; }
                stringJoiner.add(String.valueOf(c1));
                continue;
            }

            i++;

            stringJoiner.add("\u001B[%sm".formatted(ConsoleReformer.shorthands.get(c2)));
        }

        // Last char
        stringJoiner.add(String.valueOf(string.charAt(string.length() - 1)));

        return stringJoiner.toString();
    }

    @Override
    public String toString() {
        return this.value;
    }

    static {
        for (ConsoleReformer format : values()) {
            ConsoleReformer.shorthands.put(format.shorthand, format);
        }
    }
}
