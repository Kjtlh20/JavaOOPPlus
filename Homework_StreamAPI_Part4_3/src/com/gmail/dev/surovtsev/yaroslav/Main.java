/* 3)Из списка целых чисел, выделите те значения которых больше 10,
 * отсортируйте по значению последней цифры результат выведите на экран.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(-10, 0, 33, 14, 51, 74, -56, 3, 67, 34, -23);
        System.out.println(list);
        List<Integer> resultList = list.stream()
                .filter(n -> n > 10)
                .sorted((n1, n2) -> n1 % 10 - n2 % 10)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
