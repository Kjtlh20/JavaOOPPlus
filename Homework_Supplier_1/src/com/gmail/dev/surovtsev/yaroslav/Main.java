/* 1) Реализуйте с помощью класса Supplier<String> который будет при каждом
 * вызове get() возвращать слово полученное из строки переданной в качестве
 * параметра конструктору этого класса. Для упрощения задания выполните
 * разбиение строки по символу пробел.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<String> sup = new TextSplitter("Hello Java 11");
        String text;
        for (; (text = sup.get()) != null; ) {
            System.out.println(text);
        }
    }
}
