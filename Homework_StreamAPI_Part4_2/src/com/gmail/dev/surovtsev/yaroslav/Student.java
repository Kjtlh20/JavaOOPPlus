package com.gmail.dev.surovtsev.yaroslav;

import java.util.Objects;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private long recordВookNumber;

    public Student() {
        super();
    }

    public Student(String firstname, String lastname, int age, long recordВookNumber) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.recordВookNumber = recordВookNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getRecordВookNumber() {
        return recordВookNumber;
    }

    public void setRecordВookNumber(long recordВookNumber) {
        this.recordВookNumber = recordВookNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && recordВookNumber == student.recordВookNumber && Objects.equals(firstname, student.firstname) && Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age, recordВookNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", recordВookNumber=" + recordВookNumber +
                '}';
    }
}
