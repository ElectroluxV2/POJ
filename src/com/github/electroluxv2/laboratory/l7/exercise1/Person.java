package com.github.electroluxv2.laboratory.l7.exercise1;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int birthYear;

    public Person(final String firstName, final String lastName, final String birthYear) {
        Person.validatePersonalData(firstName, lastName, birthYear);
        this.birthYear = Person.parseBirthYear(birthYear);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Another example of java making things harder
     * This is not possible
     * private int parseBirthYear(final String birthYear) {
     *   return Person.parseBirthYear(birthYear);
     * }
     **/

    private static int parseBirthYear(final String birthYear) {
        int birthYearParsed;

        try {
            birthYearParsed = Integer.parseInt(birthYear);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Birth year cannot be parsed to int! Given: %s".formatted(birthYear));
        }

        if (birthYearParsed > 2020 || birthYearParsed < 1900) {
            throw new IllegalArgumentException("Birth year is incorrect! Given: %s".formatted(birthYear));
        }

        return birthYearParsed;
    }

    private static void validatePersonalData(final String firstName, final String lastName, final String birthYear) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name must not be empty");
        }

        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name must not be empty");
        }

        if (birthYear == null || birthYear.isEmpty()) {
            throw new IllegalArgumentException("Birth year must not be empty");
        }
    }

    @Override
    public String toString() {
        return "Person: %s %s [%s]".formatted(this.firstName, this.lastName, this.birthYear);
    }
}

