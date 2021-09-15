package com.gmail.dev.surovtsev.yaroslav;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StringGetter implements Supplier<String> {
    private List<String> list;
    private Predicate<String> pred;
    private int index;

    public StringGetter() {
        super();
    }

    public StringGetter(List<String> list, Predicate<String> pred) {
        super();
        this.list = list;
        this.pred = pred;
    }

    @Override
    public String get() {
        String result = null;
        String el;
        for (; index < list.size(); ) {
            el = list.get(index);
            if (pred.test(el)) {
                result = el;
                index++;
                break;
            }
            index++;
        }
        return result;
    }
}
