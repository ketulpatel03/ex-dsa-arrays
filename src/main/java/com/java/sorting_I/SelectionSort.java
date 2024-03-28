package com.java.sorting_I;

import java.util.Arrays;

public class SelectionSort {

    private static int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i <= (n - 2); i++) {
            int mini = i;
            for (int j = i; j <= (n - 1); j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(selectionSort(arr, arr.length)));
    }

}
