package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int []  nums = new int [] {2,7,11,15};
        int target = 9;
        int [] ans  = new int [2];

        Map<Integer, Integer> diffMapping = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer value  = diffMapping.get(nums[i]);
            if(value != null) {
                ans[0] = i;
                ans[1] = value;
                break;
            }

            diffMapping.put(target - nums[i], i);

        }

        for (int num : ans) {
            System.out.println(num);
        }

    }
}
