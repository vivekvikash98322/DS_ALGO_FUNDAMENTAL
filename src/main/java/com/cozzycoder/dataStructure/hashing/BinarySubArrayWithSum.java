package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class BinarySubArrayWithSum {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 1, 0, 1};
        int goal = 2;
        extracted_1(nums, goal);
        extracted_2(nums, goal);
    }

    private static void extracted_2(int[] nums, int k) {
        Function<Integer, Integer> calculate = (Integer goal) -> {

            int start = 0;
            int end = 0;
            int ans = 0;
            int sum = 0;

            while (end < nums.length) {

                sum += nums[end];

                while (sum > goal) {
                    sum -= nums[start];
                    start++;
                }

                ans += end - start + 1;
                end++;
            }

            return ans;
        };


        System.out.println(calculate.apply(k) - calculate.apply(k - 1));
    }


    private static void extracted_1(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i : nums) {
            sum += i;
            ans += map.getOrDefault(sum - goal, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans);
        ;
    }
}
