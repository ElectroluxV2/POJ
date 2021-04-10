package com.github.electroluxv2.laboratory.l5.exercise4;

import java.util.Arrays;

final class Class {
    private final String[] args;

    public Class(final String arg1, final String arg2, final String arg3, final String arg4, final String arg5) {
        this.args = new String[] {
            arg1,
            arg2,
            arg3,
            arg4,
            arg5
        };
    }

    @Override
    public final String toString() {
        return "Class containing args: %s".formatted(Arrays.toString(this.args));
    }
}
