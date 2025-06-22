package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumSumOfPair {

    public static void main(String[] args) {
        System.out.println(maximumSum(new int[] {5, 1, 6}));
    }

    public static int maximumSum(int[] nums) {

        if(nums.length == 1) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();

        int end = nums.length - 1;
        int start = 0;
        int max = 0;
        while (start <= end) {

            int sum = getDigitSum(nums[start]);
            int sumEnd = getDigitSum(nums[end]);

            if (start == end && map.containsKey(sum)) {
                max = Math.max(max, nums[start] + map.get(sum));
                start++;
                end--;
                continue;
            }

            if (map.containsKey(sum)) {
                max = Math.max(max, nums[start] + map.get(sum));

            }
            map.put(sum, nums[start]);

            if ( map.containsKey(sumEnd)) {
                max = Math.max(max, nums[end] + map.get(sumEnd));
            }

            map.put(sumEnd, nums[end]);
            start++;
            end--;
        }

        return max == 0 ? -1 : max;
    }


    public  static int getDigitSum(int val){

        int sum = 0;
        while( val != 0){
            sum += val % 10;
            val = val /10;
        }

        return sum;
    }
}
