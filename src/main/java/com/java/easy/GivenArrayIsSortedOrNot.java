package com.java.easy;

public class GivenArrayIsSortedOrNot {

    // BRUTE : BETTER : OPTIMAL : check if the given array is sorted or not
    private static boolean checkGivenArrayIsSortedOrNot(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // 3
        int[] numbers3_1 = {1, 2, 2, 3, 3, 4};
        System.out.println("check the given array is sorted or not BRUTE:BETTER:OPTIMAL : "
                + checkGivenArrayIsSortedOrNot(numbers3_1, 6));
        int[] numbers3_2 = {1, 2, 1, 3, 3, 4};
        System.out.println("check the given array is sorted or not BRUTE:BETTER:OPTIMAL : "
                + checkGivenArrayIsSortedOrNot(numbers3_2, 6));
    }

}
