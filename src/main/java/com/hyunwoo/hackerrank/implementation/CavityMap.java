package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/cavity-map/problem

public class CavityMap {

    static String[] cavityMap(String[] grid) {
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length() - 1; j++) {
                if (grid[i].charAt(j) > grid[i].charAt(j + 1) &&
                    grid[i].charAt(j) > grid[i].charAt(j - 1) &&
                    grid[i].charAt(j) > grid[i + 1].charAt(j) &&
                    grid[i].charAt(j) > grid[i - 1].charAt(j)) {
                    grid[i] = grid[i].substring(0, j) + "X" +
                        grid[i].substring(j + 1);
                }
            }
        }

        return grid;
    }

}
