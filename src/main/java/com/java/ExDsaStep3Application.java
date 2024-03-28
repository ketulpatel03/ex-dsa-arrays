package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ExDsaStep3Application {

    public static void main(String[] args) {

        SpringApplication.run(ExDsaStep3Application.class, args);


        int[] arr = {2, 7, 11, 15};
        int s = 18;

        Map<Integer, Integer> trackerMap = new HashMap<>();
		int[] returnArr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int target = s - arr[i];
			if(trackerMap.containsKey(arr[i])){
				Integer i0 = trackerMap.get(arr[i]);
				returnArr[0] = i0;
				returnArr[1] = i;
			}
			trackerMap.put(target, i);
        }

		System.out.println(Arrays.toString(returnArr));

    }

}
