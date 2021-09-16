/* 1)Используя Stream API и List<Cat> верните самое длинное имя кота в этом списке.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Ab2", 1);
        Cat cat2 = new Cat("Abc3", 2);
        Cat cat3 = new Cat("Abcdef6", 3);
        Cat cat4 = new Cat("Abcd4", 4);
        Cat cat5 = new Cat("Abcde5", 5);
        List<Cat> cats = List.of(cat1, cat2, cat3, cat4, cat5);
        System.out.println(cats);

        Optional<Cat> result = cats.stream().max((a, b) -> a.getName().length() - b.getName().length());
        result.ifPresent(a -> System.out.println("Longest name: " + a.getName()));
    }
}
