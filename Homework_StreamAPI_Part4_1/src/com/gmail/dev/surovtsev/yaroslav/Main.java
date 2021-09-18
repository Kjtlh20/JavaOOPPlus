/* 1)Разбейте строку английского текста по символу пробел.
 * Полученный набор слов отсортируйте в порядке возрастания количества
 * гласных букв в нем. Слова в которых нет гласных букв стоит исключить из результата.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String text = "publicstatic void main string rgs txt";
        String vowels = "aeiou";
        List<String> list = Stream.of(text.split(" "))
                .filter(Main::checkVowels)
                .sorted((s1, s2) -> getVowelsCount(s1) - getVowelsCount(s2))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    public static int getVowelsCount(String word) {
        int count = 0;
        String vowels = "aeiou";
        for (Character letter : vowels.toCharArray()) {
            if (word.indexOf(letter) != -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkVowels(String word) {
        String vowels = "aeiou";
        for (Character letter : vowels.toCharArray()) {
            if (word.indexOf(letter) != -1) {
                return true;
            }
        }
        return false;
    }
}
