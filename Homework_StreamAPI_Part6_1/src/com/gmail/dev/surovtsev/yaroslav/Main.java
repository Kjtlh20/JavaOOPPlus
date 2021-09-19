/* 1)Разбейте строку английского текста по символу пробел.
 * Используя reduce верните суммарное количество букв в словах длинна которых превышает 4.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String text = "public static void main string args";
        Optional<Integer> result = Stream.of(text.split(" "))
                .map(s -> s.length())
                .filter(n -> n > 4)
                .reduce((a, b) -> a + b);
        result.ifPresent(System.out::println);
    }
}
