package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class BinarySubArray_Problem_1 {

    public static void main(String[] args) {

        System.out.println(findMaxLength(new int [] {0,1,0,1}));
    }

    public static int findMaxLength(int[] nums) {

        Map<Integer, Integer>  map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i] == 0 ? -1 : nums[i];

            if(map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
                continue;
            }

            map.put(sum, i);
        }

        return max;
    }
}
