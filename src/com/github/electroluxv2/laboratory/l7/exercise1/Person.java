package com.github.electroluxv2.laboratory.l7.exercise1;

public class Person {
    private final String firstName;
    private final String lastName;
    private int birthYear;

    public Person(final String firstName, final String lastName, final String birthYear) {
        this.validatePersonalData(firstName, lastName, birthYear);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private void validatePersonalData(final String firstName, final String lastName, final String birthYear) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name must not be empty");
        }

        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name must not be empty");
        }

        if (birthYear == null || birthYear.isEmpty()) {
            throw new IllegalArgumentException("Birth year must not be empty");
        }

        try {
            this.birthYear = Integer.parseInt(birthYear);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Birth year cannot be parsed to int! Given: %s".formatted(birthYear));
        }

        if (this.birthYear > 2020 || this.birthYear < 1900) {
            throw new IllegalArgumentException("Birth year is incorrect! Given: %s".formatted(birthYear));
        }
    }

    @Override
    public String toString() {
        return "Person: %s %s [%s]".formatted(this.firstName, this.lastName, this.birthYear);
    }
}

