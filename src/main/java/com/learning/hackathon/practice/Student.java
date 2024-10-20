package com.learning.hackathon.practice;

public class Student {
    private int id;
    private String name;
    private int totalMarksobt;

    public Student(int id, String name, int totalMarksObtain) {
        this.id = id;
        this.name = name;
        totalMarksobt = totalMarksObtain;
    }

    // ********** Setters of all attributes

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalMarksobt(int totalMarksobt) {
        this.totalMarksobt = totalMarksobt;
    }

    // ********** Getters of all attributes

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalMarksobt() {
        return totalMarksobt;
    }
}
