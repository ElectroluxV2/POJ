package com.github.electroluxv2.laboratory.l5.exercise5;

import java.util.Map;

class Main {

    public static void main(final String[] args) {

        final Map<String, A> tests = Map.of(
                "A", new A(),
                "B", new B(),
                "C", new C(),
                "D", new D(),
                "E", new E()
        );

        for (final var test : tests.entrySet()) {
            test.getValue().present("Key: %s".formatted(test.getKey()));
        }
    }
}
