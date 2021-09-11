/* 3) Установите отношение естественного порядка для класса Cat на основании длинны имени. Т.е. чем
 * длиннее имя тем больше объект. Ваша реализация Comparable<Cat> должна быть
 * совместима с отношением эквивалентности (метод equals при необходимости можете также заменить).
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Aaa", 5);
        Cat cat2 = new Cat("Aaaaa", 9);
        Cat cat3 = new Cat("Bbbb", 10);
        Cat cat4 = new Cat("Abbb", 2);
        Cat cat5 = new Cat("Aa", 3);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};
        System.out.println(Arrays.toString(cats));

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
    }
}
