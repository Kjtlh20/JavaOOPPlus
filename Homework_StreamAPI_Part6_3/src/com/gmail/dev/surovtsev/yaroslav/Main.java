/* 3) Замените с помощью метода reduce терминальный метод max
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(-1, 0, 4, -5, 3, 8, 4, 2, 1);
        System.out.println(list);
        Optional<Integer> result = list.stream()
                .reduce((a, b) -> a > b ? a : b);
        result.ifPresent(System.out::println);
    }
}
