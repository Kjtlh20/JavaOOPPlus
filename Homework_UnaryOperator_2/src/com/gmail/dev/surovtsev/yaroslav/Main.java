/* 2) Создайте реализацию UnaryOperator<String> где результатом будет строка в
 * которой исключены все символы кроме цифровых. Т.е. если входящим параметром
 * является строка вида «Hello 123 world» результатом будет строка «123».
 * */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        UnaryOperator<String> unOp = s -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
            }
            return sb.toString();
        };

        String text = "Hello 123 world";
        System.out.println(text);
        System.out.println(unOp.apply(text));
    }
}
