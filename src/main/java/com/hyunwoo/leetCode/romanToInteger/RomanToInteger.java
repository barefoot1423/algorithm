//https://leetcode.com/problems/roman-to-integer/
package com.hyunwoo.leetCode.romanToInteger;

public class RomanToInteger {

    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();

        int num = 0;
        int i = 0;
        for (; i < charArray.length - 1; i++) {
            if (charArray[i] == 'I' && charArray[i + 1] == 'V') {
                num += 4;
                ++i;
                continue;
            }

            if (charArray[i] == 'I' && charArray[i + 1] == 'X') {
                num += 9;
                ++i;
                continue;
            }

            if (charArray[i] == 'X' && charArray[i + 1] == 'L') {
                num += 40;
                ++i;
                continue;
            }

            if (charArray[i] == 'X' && charArray[i + 1] == 'C') {
                num += 90;
                ++i;
                continue;
            }

            if (charArray[i] == 'C' && charArray[i + 1] == 'D') {
                num += 400;
                ++i;
                continue;
            }

            if (charArray[i] == 'C' && charArray[i + 1] == 'M') {
                num += 900;
                ++i;
                continue;
            }

            num += getValue(charArray[i]);
        }


        if (i <= charArray.length - 1) {
            num += getValue(charArray[i]);
        }

        return num;
    }

    private int getValue(char c) {
        int num = 0;
        switch (c) {
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
            default:
                break;
        }

        return num;
    }

}
