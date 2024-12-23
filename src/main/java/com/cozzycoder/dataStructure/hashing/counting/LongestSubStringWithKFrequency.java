package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LongestSubStringWithKFrequency {

    public static void main(String[] args) {

        int [] nums = new int [] {1,2,2,1,3};
        int k = 1;
        solution_1(nums, k);
    }



    private static void solution_1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int end = 0;
        int start = 0;
        int max = 0;
        while(end < nums.length){

            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            while(map.get(nums[end]) > k){
                int value =  map.getOrDefault(nums[start], 0) - 1;
                if(value == 0){
                    map.remove(nums[start]);
                    start++;
                    continue;
                }

                map.put(nums[start], value);
                start++;
            }
            max = Math.max(max , end - start + 1);
            end++;
        }
    }
}
