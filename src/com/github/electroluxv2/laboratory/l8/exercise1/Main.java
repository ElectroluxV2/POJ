package com.github.electroluxv2.laboratory.l8.exercise1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(final String[] args) throws IOException {
        final String exercisePathString = Files.createDirectories(Paths.get("exercise")).toString();
        Files.createDirectories(Paths.get(exercisePathString, "dir1"));
        Files.createDirectories(Paths.get(exercisePathString, "dir2"));

        InformationProvider.displayInformation(new File(exercisePathString));


        for (int i = 1; i <= 3; i++) {
            final Path filePath = Paths.get(exercisePathString, "file%d.txt".formatted(i));

            InformationProvider.displayInformation(filePath.toFile());

            if (Files.exists(filePath)) { continue; }

            Files.createFile(filePath);
        }
    }
}
