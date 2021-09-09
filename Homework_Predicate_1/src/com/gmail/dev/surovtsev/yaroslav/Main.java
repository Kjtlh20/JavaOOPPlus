/* 1) С помощью реализации Predicate<String> реализуйте удаление со списка
 * строк начинающихся с определенной буквы. Например удалить все строки которые начинаются на букву F.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("String", "Double", "Integer", "Float", "BigInteger", "Boolean"));
        System.out.println(list);
        list.removeIf(s -> s.toUpperCase().startsWith("F"));
        list.removeIf(Main::removeStartsWithB);
        System.out.println(list);
    }

    public static Boolean removeStartsWithB(String s) {
        return s.toUpperCase().startsWith("B");
    }
}
