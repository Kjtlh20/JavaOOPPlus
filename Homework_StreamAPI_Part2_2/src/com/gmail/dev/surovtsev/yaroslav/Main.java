/* 2) Удалите из строки символы которые не являются буквами английского алфавита.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String text = "метод public static void main(String[] args) {";
        String result = Arrays.stream(text.split(""))
                .filter(Main::isEnglishAlphabetic)
                .collect(Collectors.joining());
        System.out.println(text);
        System.out.println(result);
    }

    public static Boolean isEnglishAlphabetic(String letter) {
        boolean result = false;
        char c = letter.charAt(0);
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            result = true;
        }
        return result;
    }
}
