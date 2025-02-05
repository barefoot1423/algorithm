package com.hyunwoo.practice;

public class Member implements Cloneable {

    public String id;
    public String name;
    public Student student;
    public int age;

    public Member(String id, String name, Student student, int age) {
        this.id = id;
        this.name = name;
        this.student = student;
        this.age = age;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
        }

        return cloned;
    }

    @Override
    public String toString() {
        return "Member{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", student=" + student +
            ", age=" + age +
            '}';
    }

}
