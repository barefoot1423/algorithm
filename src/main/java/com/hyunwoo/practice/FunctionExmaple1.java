package com.hyunwoo.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExmaple1 {

    private static List<Student> list = Arrays.asList(
        new Student("Hong", 90, 96),
        new Student("Sin", 95, 93)
    );

    public static void printString(Function<Student, String> function) {
        for (Student student : list) {
            System.out.println(function.apply(student));
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function) {
        for (Student student : list) {
            System.out.println(function.applyAsInt(student));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Student name");
        printString(t -> t.name);

        System.out.println("English grade");
        printInt(t -> t.englishGrade);

        System.out.println("Math grade");
        printInt(t -> t.mathGrade);
    }

}
