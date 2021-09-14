/* 2)Создайте реализацию BinaryOperator<List<Integer>> которая вернет список в
 * котором будут только те элементы которые одновременно присутствуют в первом и во
 * втором списке целых чисел использованных в качестве параметров.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.*;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        BinaryOperator<List<Integer>> biOp = (l1, l2) -> {
            Set<Integer> s1 = new HashSet<>(l1);
            Set<Integer> s2 = new HashSet<>(l2);
            s1.retainAll(s2);
            List<Integer> l3 = new ArrayList<>(s1);
            return l3;
        };

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(List.of(2, 3, 4));
        System.out.println(biOp.apply(list1, list2));
    }
}
