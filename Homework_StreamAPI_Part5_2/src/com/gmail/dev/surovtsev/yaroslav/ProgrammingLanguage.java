package com.gmail.dev.surovtsev.yaroslav;

public class ProgrammingLanguage {
    private String name;
    private DifficultyLevel complexity;

    public ProgrammingLanguage() {
        super();
    }

    public ProgrammingLanguage(String name, DifficultyLevel complexity) {
        super();
        this.name = name;
        this.complexity = complexity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DifficultyLevel getComplexity() {
        return complexity;
    }

    public void setComplexity(DifficultyLevel complexity) {
        this.complexity = complexity;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", complexity=" + complexity +
                '}';
    }
}
