package com.github.electroluxv2.laboratory.l5.Exercise4;

import java.util.Arrays;

final class Class {
    private final String[] args;

    public Class(String arg1, String arg2, String arg3, String arg4, String arg5) {
        this.args = new String[] {
            arg1,
            arg2,
            arg3,
            arg4,
            arg5
        };
    }

    @Override
    public String toString() {
        return "Class containing args: %s".formatted(Arrays.toString(this.args));
    }
}
