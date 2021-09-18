/* 2)Реализуйте возможность выбора из списка языков программирования (пример в лекции)
 * язык с заданной сложностью обучения. Верните любой из обладающих нужной сложностью.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ProgrammingLanguage lang1 = new ProgrammingLanguage("Haskell", DifficultyLevel.HARD);
        ProgrammingLanguage lang2 = new ProgrammingLanguage("Python", DifficultyLevel.EASY);
        ProgrammingLanguage lang3 = new ProgrammingLanguage("Java", DifficultyLevel.MEDIUM);
        ProgrammingLanguage lang4 = new ProgrammingLanguage("C++", DifficultyLevel.HARD);
        ProgrammingLanguage lang5 = new ProgrammingLanguage("JS", DifficultyLevel.EASY);
        List<ProgrammingLanguage> languages = List.of(lang1, lang2, lang3, lang4, lang5);

        DifficultyLevel difficultyLevel = DifficultyLevel.HARD;
        Optional<ProgrammingLanguage> result = languages.stream()
                .filter(pl -> pl.getComplexity() == difficultyLevel)
                .findAny();
        result.ifPresent(System.out::println);
    }
}
