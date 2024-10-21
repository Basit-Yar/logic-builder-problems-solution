package com.learning.hackathon.practice;

public class Student {
    private int id;
    private String name;
    private int totalMarksObt;

    public Student(int id, String name, int totalMarksObtain) {
        this.id = id;
        this.name = name;
        totalMarksObt = totalMarksObtain;
    }

    // ********** Setters of all attributes

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalMarksObt(int totalMarksObt) {
        this.totalMarksObt = totalMarksObt;
    }

    // ********** Getters of all attributes

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalMarksObt() {
        return totalMarksObt;
    }
}
