package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/drawing-book/problem

public class DrawingBook {

    public int pageCount(int n, int p) {

        int total = n / 2;
        int right = p / 2;
        int left = total - right;

        return Math.min(right, left);
    }

}
