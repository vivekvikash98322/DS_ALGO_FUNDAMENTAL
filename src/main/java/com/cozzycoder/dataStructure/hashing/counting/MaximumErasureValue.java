package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;

public class MaximumErasureValue {

    public static void main(String[] args) {

        int [] nums = new int[] {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[nums.length];
        int end = 0;
        int sum = 0;
        int max = 0;
        int start = 0;

        while (end < nums.length) {

            sum += nums[end];
            arr[end] = sum;

            if (map.containsKey(nums[end]) &&  !(map.get(nums[end]) < start)) {
                start = map.get(nums[end]);
            }

            max = Math.max(max, arr[end] - arr[start]);
            map.put(nums[end], end);
            end++;
        }

        System.out.println(max);
    }
}
