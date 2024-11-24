package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {

    public static void main(String[] args) {

        int [] nums = new int [] {5,7,3,9,4,9,8,3,1};
        solution_1(nums);
        solution_2(nums);
    }

    private static void solution_2(int[] nums) {
        int [] map = new int [1001];
        int ans = 0;
        for (int num : nums){
           map[num]++;
        }

        for (int num : nums) {

            if(map[num] == 1){
                ans = Math.max(ans, num);
            }
        }

        System.out.println(ans);
    }

    private static void solution_1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> kv : map.entrySet()) {

            if(kv.getValue() == 1){
                ans = Math.max(ans, kv.getKey());
            }
        }

        System.out.println(ans);
    }
}
