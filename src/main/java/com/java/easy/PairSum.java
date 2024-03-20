package com.java.easy;

import java.util.*;

public class PairSum {

    private static List<int[]> sumOfElements(int[] arr, int s) {

        int n = arr.length;
        int target = s;
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();

        int[] returnArr = new int[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            returnArr = new int[2];

            int mark = target - arr[i];

            if (map.containsKey(mark)) {
                returnArr[0] = mark;
                returnArr[1] = map.get(mark);
                count++;
            }
            map.put(arr[i], mark);
            if (count > 0) {
                list.add(returnArr);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int s = 5;
        List<int[]> list = sumOfElements(arr, s);
        for (int[] e : list) {
            System.out.println(Arrays.toString(e));
        }
    }

}
