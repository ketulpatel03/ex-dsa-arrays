package com.java.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

    private static List<Integer> nextPermutation(List<Integer> A) {

        int n = A.size();
        int index = -1;

        // 1st reverse loop to find index breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                index = i;
                break;
            }
        }

        // check if no index breakpoint is possible then sort the list and return
        if (index == -1) {
            Collections.reverse(A);
            return A;
        }

        // 2nd reverse loop to find greatest but the smallest element
        for (int i = n - 1; i >= index; i--) {
            if (A.get(i) > A.get(index)) {
                int temp = A.get(i);
                A.set(i, A.get(index));
                A.set(index, temp);
                break;
            }
        }

        // 3rd : reverse the right sublist of the array
        List<Integer> sublist = A.subList(index + 1, n);
        Collections.reverse(sublist);

        return A;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(new Integer[]{2, 1, 5, 4, 3, 0, 0});
        List<Integer> list2 = new ArrayList<>(List.of(2, 1, 5, 4, 3, 0, 0));

        List<Integer> list = nextPermutation(list1);
        System.out.println(list.toString());
    }
}
