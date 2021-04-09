package com.github.electroluxv2.laboratory.l5.Exercise5;

abstract class D extends C {
    @Override
    protected void present(final String phrase) {
        super.present(phrase);
        System.out.printf("D: %s%n", phrase);
    }
}
