package com.hyunwoo.javaAlgorithmBook.sort.selection;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
        Sort s = new Sort();
        System.out.println("Element to be sorted :");
        System.out.println(Arrays.toString(a));
        s.selectionSort(a);
        System.out.println("Element after sorting");
        System.out.println(Arrays.toString(a));
    }

}
