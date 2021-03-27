package com.hyunwoo.codejam.y2021.qualification.reversort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reversort {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCase = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= testCase; ++i) {
            int size = Integer.parseInt(in.nextLine());
            int[] arr = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.println("Case #" + i + ": " + getResult(size, arr));
        }

    }

    private static String getResult(int size, int[] arr) {
        int cost = 0;
        for (int i = 0, j = 0; i < size - 1; i++) {
            int minIdx = findMin(arr, i, j);
            cost += minIdx - i + 1;
            j = minIdx;
            reverseArray(arr, i, j);
        }

        return String.valueOf(cost);
    }

    private static int findMin(int[] arr, int i, int j) {
        int min = arr[i];
        for (int k = i + 1; k < arr.length; k++) {
            if (min > arr[k]) {
                min = arr[k];
            }
        }

        return Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(min);
    }

    private static void reverseArray(int[] arr, int i, int j) {
        while (j > i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }

}
