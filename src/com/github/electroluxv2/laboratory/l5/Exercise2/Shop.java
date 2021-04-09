package com.github.electroluxv2.laboratory.l5.Exercise2;

// Nie powinno być public
abstract class Shop {
    private final String address;
    private final int size;

    protected Shop(final String address, final int size) {
        this.address = address;
        this.size = size;
    }

    protected String getInformation() {
        return "Address: %s, size: %d".formatted(this.address, this.size);
    }
}
