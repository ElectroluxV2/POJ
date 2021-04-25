package com.github.electroluxv2.laboratory.l7.exercise5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Local {
    private final static Pattern REGEX = Pattern.compile("(?<street>.+?(?=[0-9]))(((?<houseNumber>[a-zA-Z0-9]+)\\/(?<localNumber>[a-zA-Z0-9]+),)|(?<houseNumberOnly>[A-z0-9]+),) (?<postalCode>[0-9]{2}-[0-9]{3}) (?<city>\\S+)");
    private final String name;
    private final String city;
    private final String postalCode;
    private final String street;
    private final String houseNumber;
    private final String localNumber;

    public Local(final String name, final String address) throws Exception {
        this.name = name;

        Matcher matcher = Local.REGEX.matcher(address);

        if (!matcher.find()) {
            throw new Exception("Invalid address data, given: %s".formatted(address));
        }

        this.city = matcher.group("city");
        this.postalCode = matcher.group("postalCode");
        this.street = matcher.group("street").trim();

        if (matcher.group("houseNumberOnly") != null) {
            this.houseNumber = matcher.group("houseNumberOnly");
            this.localNumber = null;
        } else {
            this.houseNumber = matcher.group("houseNumber");
            this.localNumber = matcher.group("localNumber");
        }
    }

    @Override
    public String toString() {
        final String s = "%s%nCity: %s%nPostalCode: %s%nStreet: %s%nHouse: %s".formatted(this.name, this.city, this.postalCode, this.street, this.houseNumber);
        if (this.localNumber == null) { return s; }
        return "%s/%s".formatted(s, this.localNumber);
    }
}
