package com.hyunwoo.practice;

public class PassByValue {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        foo(aDog);
        System.out.println(aDog.getName());
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        aDog.getName().equals("Max"); // true
        aDog.getName().equals("Fifi"); // false
        System.out.println(aDog == oldDog); // true
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d.setName("FFF");
//        d = new Dog("Fifi");
//        System.out.println(d.getName().equals("Fifi"));// true
    }

    static class Dog {

        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
