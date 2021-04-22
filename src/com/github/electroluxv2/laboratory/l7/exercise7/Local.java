package com.github.electroluxv2.laboratory.l7.exercise7;

import java.util.StringJoiner;

public class Local {
    private final String name;
    private final String city;
    private final String postalCode;
    private final String street;
    private final String houseNumber;
    private final String localNumber;

    public Local(final String name, final String address) {
        this.name = name;
        final String[] parts = address.split(" ");
        this.city = parts[parts.length - 1];
        this.postalCode = parts[parts.length - 2];

        final String houseAndLocalNumber = parts[parts.length - 3];
        final String[] temp = houseAndLocalNumber.split("/");
        if (temp.length == 1) {
            this.houseNumber = temp[0].substring(0, temp[0].length() - 1);
            this.localNumber = null;
        } else {
            this.houseNumber = temp[0];
            this.localNumber = temp[1].substring(0, temp[1].length() - 1);
        }

        final StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < parts.length - 3; i++) {
            stringJoiner.add(parts[i]);
        }

        this.street = stringJoiner.toString();
    }

    @Override
    public String toString() {
        final String s = "%s%nCity: %s%nPostalCode: %s%nStreet: %s%nHouse: %s".formatted(this.name, this.city, this.postalCode, this.street, this.houseNumber);
        if (this.localNumber == null) { return s; }
        return "%s/%s".formatted(s, this.localNumber);
    }
}
