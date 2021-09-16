/* 3)Удалите из List<Cat> всех кошек вес которых меньше 3 кг, отсортируйте их по именам (в
 * лексикографическом порядке) и соберите результат в новый список Cat.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Aaaa", 1, 9.3);
        Cat cat2 = new Cat("Bb", 2, 5.3);
        Cat cat3 = new Cat("Zzzzzzzz", 5, 3.0);
        Cat cat4 = new Cat("Xxy", 4, 8.1);
        Cat cat5 = new Cat("Xxx", 3, 5.4);
        List<Cat> cats = List.of(cat1, cat2, cat3, cat4, cat5);
        System.out.println(cats);

        Comparator<Cat> catComp = (c1, c2) -> {
            String name1 = c1.getName();
            String name2 = c2.getName();
            if (name1.length() == name2.length()) {
                return name1.compareTo(name2);
            } else {
                return name1.length() - name2.length();
            }
        };

        List<Cat> result = cats.stream().filter(cat -> cat.getWeight() > 3).sorted(catComp).collect(Collectors.toList());
        System.out.println(result);
    }
}
