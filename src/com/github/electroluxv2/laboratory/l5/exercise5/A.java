package com.github.electroluxv2.laboratory.l5.exercise5;

class A {
    protected void present(final String phrase) {
        System.out.printf(this.getClass().getSimpleName() + ": %s%n", phrase);
    }
}