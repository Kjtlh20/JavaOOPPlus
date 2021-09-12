/* 4)Создайте такую реализацию Comparator<Integer> что бы с ее помощью можно было
 * найти максимальное простое число в списке целых чисел, если такого числа в списке нет то
 * должно быть возвращено минимальное число.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(23, 57, 36, 34, 15, 11, 53, 46, 68));
        List<Integer> list2 = new ArrayList<>(List.of(36, 34, 15, 46, 68));
        System.out.println(list1.toString());
        System.out.println(list2.toString());

        Comparator<Integer> comp1 = Main::numberComparator;
        Comparator<Integer> comp2 = (a, b) -> Integer.compare(b, a);
        Comparator<Integer> comp3 = comp1.thenComparing(comp2);

        System.out.println("max1: " + Collections.max(list1, comp3));
        System.out.println("max2: " + Collections.max(list2, comp3));

        Collections.sort(list1, comp3);
        System.out.println(list1);
        Collections.sort(list2, comp3);
        System.out.println(list2);
    }

    public static int numberComparator(Integer a, Integer b) {
        if (checkPrime(a) && !checkPrime(b)) {
            return 1;
        }
        if (!checkPrime(a) && checkPrime(b)) {
            return -1;
        }
        if (checkPrime(a) && checkPrime(b)) {
            return a - b;
        }
        return 0;
    }

    public static Boolean checkPrime(Integer n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}