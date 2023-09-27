package com.hyunwoo.practice;

public class CallByValue {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println("in main : " + a + " " + b);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("in swap : " + a + " " + b);
    }

}
