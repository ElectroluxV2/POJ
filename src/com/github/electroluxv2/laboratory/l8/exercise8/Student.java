package com.github.electroluxv2.laboratory.l8.exercise8;

public class Student implements Comparable {
    private final String givenName;
    private final String familyName;
    private final String id;

    public Student(final String givenName, final String familyName, final String id) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public int compareTo(final Object other) {
        if (!(other instanceof Student)) {
            System.exit(1);
        }

        final Student otherStudent = (Student) other;

        return this.id.compareTo(otherStudent.id);
    }
}
