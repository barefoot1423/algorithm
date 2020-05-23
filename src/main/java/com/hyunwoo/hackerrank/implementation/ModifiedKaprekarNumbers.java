package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/kaprekar-numbers/problem

public class ModifiedKaprekarNumbers {
    public void kaprekarNumbers(int p, int q) {
        StringBuilder ret = new StringBuilder();

        for (int i = p; i <= q; i++) {
            long square = (long) i * i;
            String squareString = String.valueOf(square);
            String leftString = squareString.substring(0, squareString.length() / 2);
            String rightString = squareString.substring(squareString.length() / 2);
            if (leftString.isEmpty()) {
                leftString = "0";
            }
            int sum = Integer.valueOf(leftString) + Integer.valueOf(rightString);
            if (sum == i) {
                ret.append(sum).append(" ");
            }
        }

        if (ret == null || ret.toString().isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(ret.toString().trim());
        }
    }
}
