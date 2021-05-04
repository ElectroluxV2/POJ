package com.github.electroluxv2.laboratory.l8.exercise5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.Objects;

public class Main {

    private static final String root = "src/com/github/electroluxv2/laboratory/l8/exercise5/";

    public static void main(final String[] args) throws IOException {

        final String today = new Date().toString();
        for (final File input : Objects.requireNonNull(Path.of(Main.root, "inbound").toFile().listFiles())) {
            final File output = Path.of(Main.root, "outbound", "%s_%s.out".formatted(input.getName(), today.formatted("YYYY-MM-DD"))).toFile();

            final PrintWriter printWriter = new PrintWriter(output);
            for (final String line : Files.lines(input.toPath()).toList()) {
                for (final char c : line.toCharArray()) {
                    char z = c;

                    if (c == ' ') {
                        z = '_';
                    } else {
                        if (c + 3 > 'z') {
                            int dif = c + 3 - 'z' + 1;
                            z = (char) ('a' + dif);
                        } else {
                            z += 3;
                        }
                    }

                    printWriter.print(z);
                }
                printWriter.printf("%n");
            }
            printWriter.close();

            if (!input.delete()) {
                throw new IOException("Can't delete file: %s".formatted(input.getPath()));
            }
        }
    }
}
