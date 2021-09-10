/*4)Опишите такую реализацию BiFunction<String,String,String[]> которая вернет в виде массива
 * слова которые одновременно присутствуют и в первой строке и во второй (слова разделены пробелами).
 * Например text1 = «Hello Java», text2 = «Hello Python» в результате должен быть массив вида [«Hello»].
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        BiFunction<String, String, String[]> biFunc = Main::getIntersection;

        String t1 = "Hello Java Map Func";
        String t2 = "Hello Python Dict Func";
        System.out.println(Arrays.toString(biFunc.apply(t1, t2)));
    }

    public static String[] getIntersection(String text1, String text2) {
        String[] arr1 = text1.split(" ");
        String[] arr2 = text2.split(" ");
        Set<String> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<String> set2 = new HashSet<>(Arrays.asList(arr2));
        set1.retainAll(set2);
        String[] arr3 = new String[set1.size()];
        int i = 0;
        for (String el : set1) {
            arr3[i] = el;
            i++;
        }
        return arr3;
    }
}
