//https://leetcode.com/problems/sqrtx/
package com.hyunwoo.leetCode.sqrt;

public class Sqrt {

    public int mySqrt(int x) {

        long r = x;

        while (r * r > x) {
            r = (r + x / r) / 2;
        }

        return (int) r;

        // see this link and you need to understand this part https://en.wikipedia.org/wiki/Integer_square_root#Using_only_integer_division
        // what is Newton's method?
    }

}
