package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;

public class ExactCountSubArray {

    public static void main(String[] args) {

        int [] nums = new int []{1, 1, 1};
        int k = 2;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans);
    }
}
