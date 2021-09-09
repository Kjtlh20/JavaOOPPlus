package com.gmail.dev.surovtsev.yaroslav;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(Map.of(1, "Hello", 2, "Cat", 3, "Tom", 4, "Spike", 5, "Jerry"));
        System.out.println(map);

        BiPredicate<Integer, String> filter = (k, v) -> v.length() != k;
        map.entrySet().removeIf(entry -> filter.test(entry.getKey(), entry.getValue()));
        System.out.println(map);
    }
}
