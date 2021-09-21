/* 1) Соберите элементы потока целых чисел в две строки (одна для четных чисел,
 * вторая для нечетных чисел) в качестве разделителя используйте «;».
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Function<Integer, String> keyMapper = a -> (a % 2 == 0) ? "even" : "odd";
        Function<Integer, String> valueMapper = a -> Integer.toString(a);
        BinaryOperator<String> mergeFunction = (a, b) -> a + ";" + b;
        Supplier<Map<String, String>> supplier = HashMap::new;
        Map<String, String> result = list.stream()
                .collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, supplier));
        System.out.println(result);
    }
}
