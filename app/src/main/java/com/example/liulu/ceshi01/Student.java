package com.example.liulu.ceshi01;

/**
 * Created by liulu on 2015/4/25.
 */
public class Student {
    private String name;
    private String className;
    private int age;
    private int score;

    public Student(String name, String className, int age, int score) {
        this.name = name;
        this.className = className;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
