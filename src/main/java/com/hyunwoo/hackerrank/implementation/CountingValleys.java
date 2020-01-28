package com.hyunwoo.hackerrank.implementation;

//https://www.hackerrank.com/challenges/counting-valleys/problem

public class CountingValleys {

    public int countingValleys(int n, String s) {

        int vallyCount = 0;
        int altitude = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'U') {
                altitude++;

                if (altitude == 0) {
                    vallyCount++;
                }
            } else {
                altitude--;
            }
        }

        return vallyCount;
    }

}
