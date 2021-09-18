/* 1)Создайте текстовый файл с url адресами. Используя Stream API выделите только те
 * адреса которые являются доступными на текущий момент.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.io.IOException;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("urls.csv"))) {
            List<String> list = stream.filter(s -> {
                try {
                    URL url = new URL(s);
                    url.openStream().close();
                    return true;
                } catch (IOException e) {
                    return false;
                }
            }).collect(Collectors.toList());
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
