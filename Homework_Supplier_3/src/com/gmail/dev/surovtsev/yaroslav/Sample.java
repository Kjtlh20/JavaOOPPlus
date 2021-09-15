package com.gmail.dev.surovtsev.yaroslav;

import java.util.function.IntSupplier;

public class Sample implements IntSupplier {
    private int[] a;
    private int index;

    public Sample() {
        super();
    }

    public Sample(int[] a) {
        this.a = a;
        this.index = 0;
    }

    @Override
    public int getAsInt() {
        if (index >= a.length) {
            throw new IndexOutOfBoundsException();
        }
        return a[index++];
    }
}
