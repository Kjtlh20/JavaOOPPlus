package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Windows10", "MacOS", "Linux", "Java11", "Python"));
        List<String> listWithNumber = new ArrayList<>();

        Consumer<String> cons = s -> {
            char[] letters = s.toCharArray();
            for (char el : letters) {
                if (Character.isDigit(el)) {
                    listWithNumber.add(s);
                    break;
                }
            }
        };

        list.forEach(el -> cons.accept(el));
        System.out.println(list);
        System.out.println(listWithNumber);
    }
}
