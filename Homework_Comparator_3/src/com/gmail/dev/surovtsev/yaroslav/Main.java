/* 3)Создайте реализацию Comparator<Integer> для сортировки списка целых чисел. Но сравнение
 * должно выполняться на основание суммы первой и последней цифры числа. Т.е например список
 * чисел подобного вида [62,2000,306,55] должен быть отсортирован как [2000, 62, 306,55].
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(62, 2000, 306, 55));
        System.out.println(list);

        Comparator<Integer> comp = (a, b) -> getSumFirstLast(a) - getSumFirstLast(b);
        list.sort(comp);
        System.out.println(list);
    }

    public static Integer getSumFirstLast(Integer n) {
        if (n < 10) {
            return n;
        }
        Integer last = n % 10;
        Integer first = n / (int) Math.pow(10, n.toString().length() - 1);
        return first + last;
    }
}
