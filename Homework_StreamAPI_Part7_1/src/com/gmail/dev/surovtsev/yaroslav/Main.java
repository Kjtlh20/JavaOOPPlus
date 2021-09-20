/* 1) Используя Collector напишите свою реализацию метода Collectors.toSet()
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        Set<Integer> set = list.stream().collect(HashSet::new, (s, a) -> s.add(a), (s1, s2) -> s1.addAll(s2));
        System.out.println(set);
    }
}
