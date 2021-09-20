/* 2) Используя Collector соберите в карту, только те слова в потоке строк, в которых есть гласные.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Predicate<String> pred = Main::checkVowels;
        Collector<String, Map<String, List<String>>, Map<String, List<String>>> collector = getCollectorVowel(pred);
        String text = "write your cd here public sttc void main string rgs";
        System.out.println(text);
        Map<String, List<String>> map = Stream.of(text.split(" ")).collect(collector);
        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    public static boolean checkVowels(String word) {
        String vowels = "aeiou";
        for (Character letter : vowels.toCharArray()) {
            if (word.indexOf(letter) != -1) {
                return true;
            }
        }
        return false;
    }

    public static Collector<String, Map<String, List<String>>, Map<String, List<String>>>
    getCollectorVowel(Predicate<String> pred) {
        class CollectorVowel implements Collector<String, Map<String, List<String>>, Map<String, List<String>>> {

            public CollectorVowel() {
                super();
            }

            @Override
            public Supplier<Map<String, List<String>>> supplier() {
                return HashMap::new;
            }

            @Override
            public BiConsumer<Map<String, List<String>>, String> accumulator() {
                return (m, s) -> {
                    if (pred.test(s)) {
                        List<String> list = m.get("word with vowels");
                        if (list == null) {
                            m.put("word with vowels", new ArrayList<>());
                        }
                        m.get("word with vowels").add(s);
                    }
                };
            }

            @Override
            public BinaryOperator<Map<String, List<String>>> combiner() {
                return (m1, m2) -> {
                    Map<String, List<String>> resultMap = new HashMap<>();
                    resultMap.putAll(m1);
                    resultMap.putAll(m2);
                    return resultMap;
                };
            }

            @Override
            public Function<Map<String, List<String>>, Map<String, List<String>>> finisher() {
                return (m) -> {
                    List<String> list = m.get("word with vowels");
                    if (list == null) {
                        return m;
                    }
                    list.sort(String::compareTo);
                    m.put("word with vowels", list);
                    return m;
                };
            }

            @Override
            public Set<Characteristics> characteristics() {
                return Set.of(Characteristics.UNORDERED);
            }
        }
        return new CollectorVowel();
    }
}
