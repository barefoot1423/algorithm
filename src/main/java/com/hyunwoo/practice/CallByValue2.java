package com.hyunwoo.practice;

public class CallByValue2 {

    public static class Person {

        int a = 10;
        int b = 20;

    }

    public static void main(String[] args) {
        Person person = new Person();

        swap(person);
        System.out.println("In Main : " + person.a + " " + person.b);
    }

    private static void swap(Person person) {
        int c = person.a;
        person.a = person.b;
        person.b = c;

        System.out.println("In swap : " + person.a + " " + person.b);
    }

}
