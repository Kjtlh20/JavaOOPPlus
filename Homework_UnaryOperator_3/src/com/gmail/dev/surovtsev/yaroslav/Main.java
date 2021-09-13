/* 3) Создайте реализацию UnaryOperator<List<String>> где результатом будет список
 * строк (созданный на основе списка выступающего в качестве параметра)
 * длинна которых больше 5 символов.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("com", "gmail", "dev", "surovtsev", "yaroslav"));

        UnaryOperator<List<String>> unOp = l -> {
            List<String> newList = new ArrayList<>();
            for (String el : l) {
                if (el.length() > 5) {
                    newList.add(el);
                }
            }
            return newList;
        };

        System.out.println(list);
        System.out.println(unOp.apply(list));
    }
}
