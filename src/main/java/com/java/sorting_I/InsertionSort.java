package com.java.sorting_I;

import java.util.Arrays;

public class InsertionSort {

    private static int[] insertionSort(int[] arr, int n) {

        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(insertionSort(arr, arr.length)));
    }

}
