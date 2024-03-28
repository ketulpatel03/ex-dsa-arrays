package com.java.sorting_I;

import java.util.Arrays;

public class BubbleSort {

    private static int[] bubbleSort(int[] arr, int n) {

        for (int i = (n - 1); i >= 1; i--) {
            int didSwap = 0;
            for (int j = 0; j <= (i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(bubbleSort(arr, arr.length)));
    }

}
