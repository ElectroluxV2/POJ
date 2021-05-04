package com.github.electroluxv2.laboratory.l8.exercise4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class Main {

    public static void main(final String[] args) throws FileNotFoundException {
        final LocalDate date = LocalDate.of(2019, 1, 1);
        final PrintWriter printWriter = new PrintWriter("src/com/github/electroluxv2/laboratory/l8/exercise4/output.txt");

        int counter = 0;
        int addedYear = 0;
        while (counter < 100) {
            if (!date.plusYears(++addedYear).isLeapYear()) { continue; }
            counter++;

            printWriter.println(date.plusYears(addedYear).getYear());
        }

        printWriter.close();
    }
}
