/* 1)Вычитайте из текстового файла адреса каталогов файловой системы.
 * Верните первый из каталогов в котором расположено более 3-х текстовых файлов.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try {
            Stream<String> stream = Files.lines(Paths.get("files/dirs.csv"));
            Optional<File> result = stream
                    .map(File::new)
                    .filter(File::isDirectory)
                    .filter(Main::checkDir)
                    .findFirst();
            result.ifPresent(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkDir(File dir) {
        int txtFileCount = 3;
        String txtExt = "txt";
        int counter = 0;
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                continue;
            }
            String ext = file.getName().substring(file.getName().lastIndexOf(".") + 1).toLowerCase();
            if (ext.equals(txtExt)) {
                counter++;
            }
        }
        return (counter >= txtFileCount);
    }
}
