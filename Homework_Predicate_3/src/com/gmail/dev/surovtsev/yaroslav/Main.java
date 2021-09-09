package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);
        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        System.out.println(cats);

        int age = 5;
        String letter = "C";
        Predicate<Cat> filter1 = cat -> cat.getAge() < age;
        Predicate<Cat> filter2 = cat -> cat.getName().substring(0, 1).toUpperCase().compareTo(letter.toUpperCase()) > 0;
        cats.removeIf(filter1.and(filter2));
        System.out.println(cats);
    }
}
