package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.function.Supplier;

public class TextSplitter implements Supplier<String> {
    private String text;
    private String[] arr;
    private int index;

    public TextSplitter() {
        super();
    }

    public TextSplitter(String text) {
        super();
        this.text = text;
        this.arr = text.split(" ");
        this.index = 0;
    }

    @Override
    public String get() {
        if (index >= arr.length) {
            return null;
        }
        return arr[this.index++];
    }

    @Override
    public String toString() {
        return "TextSplitter{" +
                "text='" + text + '\'' +
                ", arr=" + Arrays.toString(arr) +
                ", index=" + index +
                '}';
    }
}
