package com.github.electroluxv2.laboratory.l8.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(final String[] args) throws IOException, NumberFormatException {
        final List<String> lines = Files.lines(Paths.get("src/com/github/electroluxv2/laboratory/l8/exercise3/input.txt")).toList();

        int sum = 0;
        boolean odd = false;
        for (final String line : lines) {
            if (odd = !odd) { continue; }

            sum += Integer.parseInt(line);
        }

        System.out.println(sum);
    }
}
