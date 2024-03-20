package com.java.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    private static int majorityElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                Integer count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        if (map == null) {
            return -1;
        } else {
            for (var m : map.entrySet()) {
                Integer count2 = m.getValue();
                if (count2 > (arr.length / 2)) {
                    return m.getKey();
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 2, 2};
        System.out.println(majorityElement(arr));
    }

}
