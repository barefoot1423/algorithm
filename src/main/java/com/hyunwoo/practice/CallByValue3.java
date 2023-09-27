package com.hyunwoo.practice;

public class CallByValue3 {

    public static class Person {

        String name = null;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Person person = new Person("Joseph");

        swap3(person);
        System.out.println("In Main : " + person.getName()); // Joseph
    }

    private static void swap(Person person) {
        person = new Person("Test");


        System.out.println("In swap : " + person.getName()); // Test
    }


    private static void swap2(Person person) {
        person = new Person("Test2");

        System.out.println("In swap2 : " + person.getName()); // Test2

        person.setName("Test3");

        System.out.println("In swap2 : " + person.getName()); // Test3
    }

    private static void swap3(Person person) {
        person.setName("Swap");

        System.out.println("In swap3 : " + person.getName()); // Swap

        person.setName("Test3");

        System.out.println("In swap3 : " + person.getName()); // Test3


    }

}
