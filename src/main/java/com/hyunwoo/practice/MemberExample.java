package com.hyunwoo.practice;

public class MemberExample {

    public static void main(String[] args) {
        Member original = new Member("1111", "Test", new Student("Test", 100, 100),10);

        Member cloned = original.getMember();

        cloned.student.name = "newName";


        System.out.println(original);
        System.out.println();
        System.out.println(cloned.toString());

    }
}
