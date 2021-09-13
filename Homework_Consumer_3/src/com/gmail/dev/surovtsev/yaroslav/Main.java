package com.gmail.dev.surovtsev.yaroslav;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Text1", "Text2", "Text3", "Text4"));
        System.out.println(list);

        File file = new File("strings.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BiConsumer<String, File> cons = (s, f) -> {
            try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f, true)))) {
                pw.println(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        list.forEach(s -> cons.accept(s, file));
    }
}
