/* 2) Реализуйте Supplier<String> с помощью Predicate<String> реализующий
 * следующий функционал: возвращать из List<String> только строки соответствующие
 * реализации Predicate. Например если у вас есть список [«Hello», «world», «Java»], а
 * Predicate возвращает true только если слово начинается с большой буквы, ваша реализация Supplier
 * должна последовательно вернуть «Hello», «Java» и после чего возвращать null (закончились подходящие значения).
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hello", "world", "Java"));
        Predicate<String> pred = s -> Character.isUpperCase(s.charAt(0));
        StringGetter sg = new StringGetter(list, pred);
        System.out.println(sg.get());
        System.out.println(sg.get());
        System.out.println(sg.get());
        System.out.println(sg.get());
        System.out.println(sg.get());
    }
}
