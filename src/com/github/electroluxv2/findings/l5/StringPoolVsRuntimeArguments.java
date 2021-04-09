package com.github.electroluxv2.findings.l5;

public class StringPoolVsRuntimeArguments {
    public static void main(final String[] args) {
        final String stringLiteral = "A";
        final String stringLiteralCopy = "A";
        System.out.println(stringLiteral.equals(args[0]));
        System.out.println(stringLiteral == args[0]);
        System.out.println(stringLiteral == stringLiteralCopy);

        // Run time args are not part of String Pool
    }
}
