/*3)Используя композицию функций реализуйте функцию которая вернет сумму кодов
 * каждого символа в произвольной строке.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<char[], Integer> func1 = letters -> {
            int sum = 0;
            for (Character el : letters) {
                sum = sum + (int) el;
            }
            return sum;
        };
        Function<String, char[]> func2 = String::toCharArray;
        Function<String, Integer> func3 = func1.compose(func2);

        String text = "Slipknot";
        System.out.println(text + " => " + func3.apply(text));
    }
}
