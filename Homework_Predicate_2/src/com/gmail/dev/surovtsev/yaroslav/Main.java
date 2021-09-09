package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("String", "Double", "Integer", "Float", "BigInteger", "Boolean"));
        System.out.println(list);
        Character[] letters = new Character[]{'f', 'd'};
        list.removeIf(Main::removeIfStartsWith);
        list.removeIf(s -> {
            for (Character letter : letters) {
                if (s.toUpperCase().startsWith(Character.toString(letter).toUpperCase())) {
                    return true;
                }
            }
            return false;
        });
        System.out.println(list);
    }

    public static Boolean removeIfStartsWith(String s) {
        Character[] letters = new Character[]{'s', 'b'};
        for (Character letter : letters) {
            if (s.toUpperCase().startsWith(Character.toString(letter).toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}
