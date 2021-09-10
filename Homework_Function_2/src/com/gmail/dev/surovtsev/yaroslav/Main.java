/*2) Опишите такую реализацию Function<String, Integer> которая вернет
 * количество согласных букв в строке текста.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        String text = "public static void main";

        Predicate<Character> pred = Main::checkConsonant;
        Function<String, Integer> func = t -> {
            char[] letters = t.toUpperCase().toCharArray();
            int c = 0;
            for (char letter : letters) {
                if (pred.test(letter)) {
                    c++;
                }
            }
            return c;
        };

        System.out.println(text + " => " + func.apply(text));
    }

    public static Boolean checkConsonant(Character c) {
        char[] consonants = "BCDFGHJKLMNPQRSTVWXYZ".toCharArray();
        for (char el : consonants) {
            if (el == c) {
                return true;
            }
        }
        return false;
    }
}
