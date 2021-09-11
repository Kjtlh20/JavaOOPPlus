/* 1)С помощью реализации Comparator<Cat> отсортируйте массив Cat в порядке возрастания длинны имени.
 * Т.е. сначала должны идти коты чье имя самое короткое.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat", 5);
        Cat cat2 = new Cat("Cat4", 7);
        Cat cat3 = new Cat("Cat33", 2);
        Cat cat4 = new Cat("Cat5555", 1);
        Cat cat5 = new Cat("Cat4", 5);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};
        System.out.println(Arrays.toString(cats));

        Comparator<Cat> cmp = Main::catLengthNameCompare;
        Arrays.sort(cats, cmp);
        System.out.println(Arrays.toString(cats));
    }

    public static int catLengthNameCompare(Cat cat1, Cat cat2) {
        if (cat1.getName().length() - cat2.getName().length() < 0) {
            return -1;
        }
        if (cat1.getName().length() - cat2.getName().length() > 0) {
            return 1;
        }
        return 0;
    }
}
