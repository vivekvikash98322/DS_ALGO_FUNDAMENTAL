package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int []{2, 7, 11, 15}, 9));
    }

    public static int[] twoSum(int[] nums, int target) {

        int [] ans  = new int [2];
        int length = nums.length;

        Map<Integer, Integer> diffMapping = new HashMap<>();

        for (int i = 0; i < length; i++) {

            Integer value  = diffMapping.get(nums[i]);
            if(value != null) {
                ans[0] = i;
                ans[1] = value;
                break;
            }

            diffMapping.put(target - nums[i], i);
        }

        return ans;
    }
}
