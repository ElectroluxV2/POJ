package com.github.electroluxv2.laboratory.l7.exercise6;

import java.util.StringJoiner;

public class StringTransformer {
    public static String removeSigns(String text, Sign sign) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : text.toCharArray()) {
            if (Sign.is(c, sign)) { continue; }
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public static String replaceSigns(String text, Sign sign, String replacement) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : text.toCharArray()) {
            if (!Sign.is(c, sign)) { stringBuilder.append(c); }
            else stringBuilder.append(replacement);
        }

        return stringBuilder.toString();
    }

    public static String preserveSigns(String text, Sign sign) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : text.toCharArray()) {
            if (!Sign.is(c, sign)) { continue; }
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
