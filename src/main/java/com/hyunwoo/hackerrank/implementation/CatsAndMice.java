package com.hyunwoo.hackerrank.implementation;

// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem


public class CatsAndMice {
    public String catAndMouse(int x, int y, int z) {

        int distanceCatA = Math.abs(x - z);
        int distanceCatB = Math.abs(y - z);

        return distanceCatA == distanceCatB ? "Mouse C" : (distanceCatA < distanceCatB ? "Cat A" : "Cat B");
    }
}
