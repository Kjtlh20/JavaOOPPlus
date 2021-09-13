/* 1)Реализуйте Consumer<Integer> с помощью которого выведите на экран все
 * нечетные числа содержащиеся в List<Integer>.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(4, 5, 8, 98, 54, 67, 34, 65, 34, 31, 22));
        System.out.println(list);

        Consumer<Integer> cons = Main::printOddNumber;
        list.forEach(n -> cons.accept(n));
    }

    public static void printOddNumber(Integer n) {
        if (n % 2 != 0) {
            System.out.println(n);
        }
    }
}
