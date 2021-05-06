package com.github.electroluxv2.laboratory.l9.exercise1;

public class MyList<T> {
    private int currentIndex = -1;
    private final T[] array;

    @SuppressWarnings({"unchecked"})
    public MyList() {
        this.array = (T[]) new Object[20];
    }

    public boolean add(final T element) {
        if (++this.currentIndex >= 20) { return false; }
        this.array[this.currentIndex] = element;
        return true;
    }

    public int size() {
        return this.currentIndex + 1; // Count from 0
    }

    public boolean contains(final T element) {
        for (int i = 0; i < this.currentIndex + 1; i++) {
            final T item = this.array[i];
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(final T element) {
        for (int i = 0; i < this.currentIndex; i++) {
            final T item = this.array[i];

            if (item.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(final T element) {
        for (int i = this.currentIndex; i > 0; i--) {
            final T item = this.array[i];
            if (item.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.currentIndex) {
            throw new IndexOutOfBoundsException();
        }

        return this.array[index];
    }

    public void set(int index, T value) throws IndexOutOfBoundsException {
        if (index < 0 || index >= 20) {
            throw new IndexOutOfBoundsException();
        }

       this.array[index] = value;
    }
}
