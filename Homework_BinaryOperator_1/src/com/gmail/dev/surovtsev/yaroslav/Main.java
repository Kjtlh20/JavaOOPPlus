/* 1) Создайте реализацию BinaryOperator<String> которая будет возвращать самое
 * длинное слово из двух строк переданных в качестве параметров.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
        BinaryOperator<String> biOp = BinaryOperator.maxBy(comp);

        String text1 = "Java";
        String text2 = "Python";
        System.out.println(biOp.apply(text1, text2));
    }
}
