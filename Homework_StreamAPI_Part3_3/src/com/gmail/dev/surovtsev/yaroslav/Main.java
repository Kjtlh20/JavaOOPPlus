/* 3) На основе адреса каталога выделите список файлов с расширением «txt».
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        File dir = new File("files/");
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }
        Stream<File> stream = Stream.of(files);
        List<File> txtFiles = stream
                .filter(File::isFile)
                .filter(f -> {
                    String ext = f.getName().substring(f.getName().lastIndexOf(".") + 1);
                    if (ext.toLowerCase().equals("txt")) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
        txtFiles.forEach(System.out::println);
    }
}
