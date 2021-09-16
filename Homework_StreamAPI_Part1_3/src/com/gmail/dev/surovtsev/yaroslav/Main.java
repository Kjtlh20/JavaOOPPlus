/* 3)Используя Stream API верните адрес файла с максимальным размером в заданном каталоге.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        File dir = new File("files/");
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }
        System.out.println(Arrays.toString(files));

        Optional<File> result = Arrays.stream(files)
                .filter(File::isFile)
                .max((a, b) -> Long.compare(a.length(), b.length()));
        result.ifPresent(a -> System.out.println("Largest file: " + a.getName()));

    }
}
