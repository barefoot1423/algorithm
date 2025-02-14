package com.hyunwoo.practice;

public class Student {
    public String name;
    public int englishGrade;
    public int mathGrade;

    public Student(String name, int englishGrade, int mathGrade) {
        this.name = name;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", englishGrade=" + englishGrade +
            ", mathGrade=" + mathGrade +
            '}';
    }

}
