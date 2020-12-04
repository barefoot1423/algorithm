package com.hyunwoo.javaAlgorithmBook.sort.selection;

public class Sort {

    public void selectionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }

    public void swap(int a[], int min, int idx) {
        int temp = a[min];
        a[min] = a[idx];
        a[idx] = temp;
    }

}
