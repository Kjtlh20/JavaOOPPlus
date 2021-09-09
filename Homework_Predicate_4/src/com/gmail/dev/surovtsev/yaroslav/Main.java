/* 4)Используя реализацию BiPredicate<Integer, String> реализуйте удаление из Map<Integer, String>
 * всех пар ключ-значение для которых длинна строки значения не равна ключу этого значения.
 * Например такая пара как {3: «Hello»} должна быть удалена так как длинна «Hello» не равна 3, а
 * пара вида {4: «Java»} останется.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(Map.of(1, "Hello", 2, "Cat", 3, "Tom", 4, "Spike", 5, "Jerry"));
        System.out.println(map);

        BiPredicate<Integer, String> filter = (k, v) -> v.length() != k;
        map.entrySet().removeIf(entry -> filter.test(entry.getKey(), entry.getValue()));
        System.out.println(map);
    }
}
