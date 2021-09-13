/* 5)Создайте Comparator<File> для сортировке списка текстовых файлов по количеству знаков
 * препинания в них. При решении принять, что знаки препинания ограниченны символами {, . - ? !} и
 * символ пробел.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {
        List<File> list = new ArrayList<>();
        list.add(new File("files/file1.txt"));
        list.add(new File("files/file2.txt"));
        list.add(new File("files/file3.txt"));
        list.add(new File("files/file4.txt"));
        System.out.println(list.toString());
        for (File file : list) {
            System.out.println(file.getName() + " -> " + getPunctuationMarksCount(file));
        }

        ToIntFunction<File> func = Main::getPunctuationMarksCount;
        Comparator<File> comp1 = (f1, f2) -> f1.getName().compareTo(f2.getName());
        Comparator<File> comp2 = Comparator.comparingInt(func);
        Comparator<File> comp3 = comp2.thenComparing(comp2);
        list.sort(comp3);

        System.out.println(list);
        for (File file : list) {
            System.out.println(file.getName() + " -> " + getPunctuationMarksCount(file));
        }
    }

    public static int getPunctuationMarksCount(File file) {
        int count = 0;
        char[] punctuationMarks = "{,.-?!} ".toCharArray();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            for (; ; ) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                line = line.toUpperCase();
                char[] chars = line.toCharArray();
                for (Character letter : chars) {
                    if (checkPunctuationMark(letter, punctuationMarks)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static boolean checkPunctuationMark(char letter, char[] punctuationMarks) {
        for (char el : punctuationMarks) {
            if (letter == el) {
                return true;
            }
        }
        return false;
    }
}
