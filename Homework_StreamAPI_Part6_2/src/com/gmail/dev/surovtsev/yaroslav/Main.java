/* 2) Используя reduce верните произведение элементов потока полученных на основании списка целых чисел.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = list.stream()
                .reduce((a, b) -> a * b);
        result.ifPresent(System.out::println);
    }
}
