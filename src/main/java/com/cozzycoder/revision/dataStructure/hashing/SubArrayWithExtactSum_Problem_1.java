package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithExtactSum_Problem_1 {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int [] {1, 1, 1}, 2));
    }

    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int counter = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];


            if(map.containsKey(sum - k)) {
                counter += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return counter;
    }
}
