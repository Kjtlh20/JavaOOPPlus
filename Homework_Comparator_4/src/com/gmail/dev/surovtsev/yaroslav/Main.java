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
        List<Integer> list1 = new ArrayList<>(List.of(53, 23, 57, 36, 34, 15, 11, 46, 68));
        List<Integer> list2 = new ArrayList<>(List.of(36, 34, 15, 46, 68));
        System.out.println(list1.toString());

        Comparator<Integer> comp1 = Main::numberComparator;
        Comparator<Integer> comp2 = Main::notPrimeComparator;
        Comparator<Integer> comp3 = comp1.thenComparing(comp2);

        list1.sort(comp3);
        System.out.println(list1);
        Integer result1 = Collections.max(list1, comp3);
        System.out.println("result1: " + result1);

        System.out.println(list2);
        list2.sort(comp3);
        System.out.println(list2);
        Integer result2 = Collections.max(list2, comp3);
        System.out.println("result2: " + result2);
    }

    public static int notPrimeComparator(Integer a, Integer b) {
        if (!checkPrime(a) && !checkPrime(b)) {
            return Integer.compare(b, a);
        }
        if (checkPrime(a) && checkPrime(b)) {
            return Integer.compare(a, b);
        }
        return 0;
    }

    public static int numberComparator(Integer a, Integer b) {
        if (checkPrime(a) && !checkPrime(b)) {
            return 1;
        }
        if (!checkPrime(a) && checkPrime(b)) {
            return -1;
        }
        return 0;
    }

    public static Boolean checkPrime(Integer n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i != 1 && i != n) {
                return false;
            }
        }
        return true;
    }
}
