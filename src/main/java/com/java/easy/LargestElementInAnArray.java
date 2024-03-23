package com.java.easy;

import java.util.Arrays;

public class LargestElementInAnArray {

    // 1 : largest element in an array
    // BRUTE : we can sort the array and pick the (n-1) element which will be the largest element [TC: O(nlogn)]
    private static int largestElementInAnArrayWithSorting(int[] arr, int n) {
        int largest = 0;
        Arrays.sort(arr);
        largest = arr[n - 1];
        return largest;
    }

    // OPTIMAL : we can iterate over the array and use a "largest" element and can return the largest element [TC: O(n)]
    private static int largestElementInAnArray(int[] arr, int n) {
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        // 1
        int[] numbers1 = {3, 2, 1, 9, 4};
        System.out.println("largest element BRUTE : " + largestElementInAnArrayWithSorting(numbers1, 5));
        System.out.println("largest element OPTIMAL : " + largestElementInAnArray(numbers1, 5));

    }

}
