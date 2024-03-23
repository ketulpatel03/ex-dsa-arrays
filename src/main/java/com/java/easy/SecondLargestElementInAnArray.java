package com.java.easy;

import java.util.Arrays;

public class SecondLargestElementInAnArray {

    // 2 : second-largest element in an array without sorting the array
    // BRUTE : we can sort the array and use a reverse loop to find out the second-largest element
    // TC : O(nlogn)
    private static int secondLargestElementUsingSort(int[] arr, int n) {
        Arrays.sort(arr);
        int largest = arr[n - 1];
        int secondLargest = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }

    // BETTER : we can sort the array using OPTIMAL approach and again iterate the array to find second-largest
    // TC : O(n + n) : O(2n)
    private static int secondLargestElement(int[] arr, int n) {
        int largest = arr[0];
        // finding the largest element
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        // finding the second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // OPTIMAL : we will use single loop and handle largest & second-largest element under single loop
    // TC : O(n)
    private static int secondLargestElementOptimal(int[] arr, int n) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        // finding the largest and second-largest element
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // OPTIMAL : we will use single loop and handle largest & second-largest element under single loop
    // TC : O(n)
    private static int secondSmallestElementOptimal(int[] arr, int n) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        // finding the smallest and second-smallest element
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {

        // 2
        int[] numbers2 = {1, 2, 4, 7, 7, 5};
        System.out.println("second largest element BRUTE : " + secondLargestElementUsingSort(numbers2, 6));
        System.out.println("second largest element BETTER : " + secondLargestElement(numbers2, 6));
        System.out.println("second largest element OPTIMAL : " + secondLargestElementOptimal(numbers2, 6));
        System.out.println("second smallest element OPTIMAL : " + secondSmallestElementOptimal(numbers2, 6));

    }

}
