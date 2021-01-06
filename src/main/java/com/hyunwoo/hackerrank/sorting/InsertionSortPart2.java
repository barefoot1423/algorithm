package com.hyunwoo.hackerrank.sorting;

// https://www.hackerrank.com/challenges/insertionsort2/problem

public class InsertionSortPart2 {

    static void insertionSort2(int n, int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int value = arr[i];
            while (j >= 1 && arr[j - 1] > value) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = value;
            printArray(arr);
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

}
