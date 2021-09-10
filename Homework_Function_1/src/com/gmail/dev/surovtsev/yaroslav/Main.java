/*1)С помощью реализации Function<Integer[],Integer> и реализации Predicate<Integer>
 * (да нужно вспоминать и предыдущую лекцию ☺) реализуйте функцию которая вернет количество
 * простых чисел в массиве целых чисел. Например [5,6,7,8,9,10] => 2
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 6, 7, 8, 9, 10, 11};

        Predicate<Integer> pred = Main::checkPrime;
        Function<Integer[], Integer> func = arr -> {
            int c = 0;
            for (Integer el : arr) {
                if (pred.test(el)) {
                    c++;
                }
            }
            return c;
        };

        System.out.println(Arrays.toString(array) + " => " + func.apply(array));
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
