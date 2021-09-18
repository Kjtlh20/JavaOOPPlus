/* 2)Из массива студентов (да тех самых из основного в д.з) выберите студентов
 * старше 20 лет, и отсортируйте их по фамилии. Результат поместите в список.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Y1", "S1", 23, 1234567890L);
        Student s2 = new Student("Y4", "S4", 21, 2234567890L);
        Student s3 = new Student("Y3", "S3", 14, 3234567890L);
        Student s4 = new Student("Y2", "S2", 33, 4234567890L);
        Student s5 = new Student("Y5", "S5", 25, 4234567890L);
        Student[] students = new Student[]{s1, s2, s3, s4, s5};

        List<Student> list = Stream.of(students)
                .filter(s -> s.getAge() > 20)
                .sorted((stud1, stud2) -> stud1.getLastname().compareTo(stud2.getLastname()))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
