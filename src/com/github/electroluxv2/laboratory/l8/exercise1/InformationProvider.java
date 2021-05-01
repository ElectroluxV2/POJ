package com.github.electroluxv2.laboratory.l8.exercise1;

import java.io.File;

public class InformationProvider {
    public static void displayInformation(File file) {
        System.out.printf("%s, %s, is file: %b, is directory: %b, exists: %b%n",
        file.getName(),
        file.getAbsolutePath(),
        file.isFile(),
        file.isDirectory(),
        file.exists());
    }
}
