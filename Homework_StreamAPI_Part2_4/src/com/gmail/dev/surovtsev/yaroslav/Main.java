/* 4)Ниже приведен фрагмент XML документа (pom.xml — используется в Maven для указания
 * зависимостей)
 * <dependency>
 *      <groupId>junit</groupId>
 *      <artifactId>junit</artifactId>
 *      <version>4.4</version>
 *      <scope>test</scope>
 * </dependency>
 * <dependency>
 *      <groupId>org.powermock</groupId>
 *      <artifactId>powermock-reflect</artifactId>
 *      <version>3.2</version>
 * </dependency>
 * Поместите эти строки в массив строк, создайте поток на его основе и выделите значения в теге <groupid> и
 * соберите результат в список строк.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Function<String, String> func = (s) -> {
            return s.substring(s.indexOf(">") + 1, s.lastIndexOf("<"));
        };

        try (Stream<String> stream = Files.lines(Paths.get("pom.xml"))) {
            List<String> list = stream
                    .filter(line -> line.contains("<groupId>"))
                    .map(func)
                    .collect(Collectors.toList());
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
