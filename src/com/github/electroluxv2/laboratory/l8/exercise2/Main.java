package com.github.electroluxv2.laboratory.l8.exercise2;

import jdk.jshell.JShell;
import jdk.jshell.Snippet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws IOException {
        final Stream<String> stream = Files.lines(Paths.get("src/com/github/electroluxv2/laboratory/l8/exercise2/input.txt"));

        JShell js = JShell.create();

        for (final String line : stream.toList()) {
            // I know its vulnerable af and op af but still funny
            js.eval(js.sourceCodeAnalysis().analyzeCompletion(line).source()).forEach(
                event -> System.out.printf("%s: %b%n", line, event.status() == Snippet.Status.VALID
            ));
        }
    }
}
