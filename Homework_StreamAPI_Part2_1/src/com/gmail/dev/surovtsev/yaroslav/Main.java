/* 1) Удалите из строки текста все слова длиннее 5 символов.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String text = "com gmail dev surovtsev yaroslav";
        String resultText = Stream.of(text.split(" ")).filter(s -> s.length() <= 5).collect(Collectors.joining(" "));
        System.out.println(text);
        System.out.println(resultText);
    }
}
