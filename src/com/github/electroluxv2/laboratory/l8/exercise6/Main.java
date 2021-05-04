package com.github.electroluxv2.laboratory.l8.exercise6;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

    public static void main(final String[] args) throws ParseException {
        final TimeZone africa = TimeZone.getTimeZone("Africa/Abidjan");
        final TimeZone america = TimeZone.getTimeZone("America/Denver");
        final TimeZone asia = TimeZone.getTimeZone("Asia/Manila");

        final TimeZone poland = TimeZone.getTimeZone("Poland");

        System.out.print("Enter hour (HH:mm) and timezone (1 - Africa, 2 - America, 3 - Asia): ");

        final Scanner scanner = new Scanner(System.in);

        LocalTime localTime = LocalTime.parse(scanner.next(), DateTimeFormatter.ofPattern("HH:mm"));
        int hour = localTime.get(ChronoField.CLOCK_HOUR_OF_DAY);
        int minute = localTime.get(ChronoField.MINUTE_OF_HOUR);

        final Calendar calendar = Calendar.getInstance();
        final LocalDate today = LocalDate.now();
        calendar.setTimeZone(poland);
        calendar.set(today.getYear(), today.getMonthValue(), today.getDayOfMonth(), hour, minute);

        switch (scanner.nextInt()) {
            case 1 -> calendar.setTimeZone(africa);
            case 2 -> calendar.setTimeZone(america);
            case 3 -> calendar.setTimeZone(asia);
        }

        System.out.printf("%s-%s-%s %s:%s%n", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE));
    }
}
