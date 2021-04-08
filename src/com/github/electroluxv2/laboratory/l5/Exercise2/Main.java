package com.github.electroluxv2.laboratory.l5.Exercise2;

class Main {

    public static void main(final String[] args) {
      final Bakery bakery = new Bakery("Łączna 43", 12, new String[]{"Masło", "Styrta"});
      final Bookshop bookshop = new Bookshop("lipinki łużyckie", 23, new String[]{"Brykiet", "Siano"});

      System.out.println(bakery.getInformation());
      System.out.println(bookshop.getInformation());
    }
}
