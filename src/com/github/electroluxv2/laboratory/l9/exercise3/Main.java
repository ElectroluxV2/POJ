package com.github.electroluxv2.laboratory.l9.exercise3;

public class Main {

    public static void main(final String[] args) {
        final Integer[] integers = new Integer[] {
          1,2,3,100,5,6,8,9
        };

        System.out.println(Main.findMax(integers));

        final String[] strings = new String[] {
          "cc", "gg", "aa", "dd", "ee"
        };

        System.out.println(Main.findMax(strings));
    }

    public static <T extends Comparable<T>> T findMax(final T[] array) {
        assert (array.length >= 1);
        T max = array[0];
        for (final T item : array) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
