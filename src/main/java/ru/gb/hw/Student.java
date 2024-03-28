package ru.gb.hw;

import java.io.Serializable;

public class Student implements Serializable {
    //region Fields
    private String name;
    private int age;
    private transient double GPA;
    //endregion
    //region Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    //endregion
    //region Constructors
    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }
    //endregion
}
