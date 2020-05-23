package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/halloween-sale/problem

public class HalloweenSale {
    public int howManyGames(int p, int d, int m, int s) {
        int ret = 0;

        while (s >= p) {
            s -= p;
            p = Math.max(p - d, m);
            ret++;
        }

        return ret;
    }
}
