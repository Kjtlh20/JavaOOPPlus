/* 2)Используя Stream API и List<Integer> выделите только нечетные числа, отсортируйте их
 * по возрастанию и соберите в новый список.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 4, -5, 0, 3, -7, 11, -14, 8, 9);
        System.out.println(list);

        List<Integer> resultList = list.stream().filter(a -> a % 2 != 0).sorted().collect(Collectors.toList());
        System.out.println(resultList);
    }
}
