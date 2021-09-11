/* 2) Используя составной Comparator реализуйте в List<Integer> поиск числа модуль которого
 * наиболее близок к нулю. Если встретятся два модуль которых одинаково близок к нулю(например 5 и -5)
 * то верните положительное значение.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(8, -3, 7, 5, -8, -4, 3, 9, -3));
        System.out.println(list);

        Comparator<Integer> comp1 = (a, b) -> Integer.compare(Math.abs(a), Math.abs(b));
        Comparator<Integer> comp2 = (a, b) -> Integer.compare(a, b);
        Comparator<Integer> comp3 = comp1.thenComparing(comp2.reversed());
        Collections.sort(list, comp3);
        System.out.println(list);
        System.out.println("min: " + list.get(0));
    }
}
