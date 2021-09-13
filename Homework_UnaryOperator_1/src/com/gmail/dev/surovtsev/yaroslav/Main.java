/* 1) С помощью реализации UnaryOperator замените все нечетные числа в
 * списке целых чисел на нули.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 4, 2, 6, 8, 9, 4, 3, 77, 4, 32));

        UnaryOperator<Integer> unOp = n -> {
            if (n % 2 != 0) {
                return 0;
            } else {
                return n;
            }
        };

        System.out.println(list);
        list.replaceAll(unOp);
        System.out.println(list);
    }
}
