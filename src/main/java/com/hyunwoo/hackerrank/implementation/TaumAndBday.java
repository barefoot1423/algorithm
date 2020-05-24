package com.hyunwoo.hackerrank.implementation;

public class TaumAndBday {
    public long taumBday(int b, int w, int bc, int wc, int z) {

        int minPrice = Math.min(bc, wc);
        int maxPrice = Math.max(bc, wc);

        if (minPrice + z < maxPrice) {
            if (maxPrice == bc) {
                bc = minPrice + z;
            } else {
                wc = minPrice + z;
            }
        }

        return ((long) b * (long) bc) + ((long) w * (long) wc);
    }
}
