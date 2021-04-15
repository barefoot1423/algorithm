package com.hyunwoo.practice;

public class JavaTest {

    public static void main(String[] args) {
        String line = "03,1415145123,,010,550,,,030,00550,,/                   ";
        line = line.trim();

        if (line.endsWith("/")) {
            line = line.replace("/", "");
        }

        String[] split = line.split(",");
        for (String s: split) {
            System.out.println(s);
        }
        System.out.println(line);
    }

}
