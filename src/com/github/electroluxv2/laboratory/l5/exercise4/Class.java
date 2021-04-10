package com.github.electroluxv2.laboratory.l5.exercise4;

import java.util.Arrays;

final class Class {
    private final String[] args;

    public Class(final String... args) {
        this.args = args;
    }

    @Override
    public final String toString() {
        return "Class containing args: %s".formatted(Arrays.toString(this.args));
    }
}
