package com.java.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SumProblem {

    //  BETTER : using map by storing element + index : return type is string(YES/NO)
    private static String twoSumProblemMethod1(int[] arr, int n, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int more = target - a;
            if (map.containsKey(more)) {
                return "YES";
            }
            map.put(arr[i], i);
        }
        return "NO";
    }

    // BETTER : using map by storing element + index : return type is int[]
    private static int[] twoSumProblemMethod2(int[] arr, int n, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] returnArr = new int[2];

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int more = target - a;
            if (map.containsKey(more)) {
                returnArr[0] = map.get(more);
                returnArr[1] = i;
                return returnArr;
            }
            map.put(arr[i], i);
        }
        return returnArr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        // 1
        System.out.println(twoSumProblemMethod1(arr, 5, 14));
        // 2
        int[] output2 = twoSumProblemMethod2(arr, 5, 14);
        System.out.println(Arrays.toString(output2));
    }

}
