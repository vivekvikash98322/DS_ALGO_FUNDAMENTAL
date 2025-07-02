package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubArrayWithKFrequency {

    public static void main(String[] args) {
        System.out.println(maxSubarrayLength(new int[] {2,3,3,2,2}, 1));
    }

    public static int maxSubarrayLength(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
        int max = 0;

        while (end < nums.length) {

            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            while(map.get(nums[end]) > k){

                int val = map.get(nums[start]);
                if(val == 1) {
                    map.remove(nums[start]);
                    start++;
                    continue;
                }

                map.put(nums[start], val - 1);
                start++;
            }

            max = Math.max(max, end - start + 1);
            end++;
        }

        return max;

    }

}
