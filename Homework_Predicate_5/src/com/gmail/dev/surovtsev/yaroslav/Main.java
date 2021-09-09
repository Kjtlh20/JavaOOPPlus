/* 5)Создайте такую реализацию IntPredicate которая будет возвращать true в случае
 * когда сумма цифр числа число четное. Например для 103 - вернет true, так 1+0+3 = 4.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.function.IntPredicate;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{103, 107, 105, 106, 104, 108, 109};
        IntPredicate filter = n -> n % 2 == 0;
        int number;
        for (int element : array) {
            number = getSumDigits(element);
            System.out.println(number + " -> " + checkEvenOdd(number, filter));
        }
    }

    public static int getSumDigits(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + Integer.parseInt(s.substring(i, i + 1));
        }
        return sum;
    }

    public static Boolean checkEvenOdd(int number, IntPredicate filter) {
        return filter.test(number);
    }
}
