package com.github.electroluxv2.shared.utils;

import static com.github.electroluxv2.shared.utils.ConsoleReformer.FOREGROUND_RED;

public class Tests {
    public static void main(final String[] args) {
        FOREGROUND_RED.flush();
        System.out.println("Test");
        System.out.println(ConsoleReformer.translateCodes("&4te&2st&1fdsf"));
    }
}
