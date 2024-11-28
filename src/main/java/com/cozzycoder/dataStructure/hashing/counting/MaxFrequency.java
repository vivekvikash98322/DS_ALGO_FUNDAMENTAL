package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {

    public static void main(String[] args) {

        int [] nums = new int [] {1,2,2,3,1,4};

        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int counter = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, map.get(num));
        }

        for(Map.Entry<Integer, Integer> kv : map.entrySet()){

            if(max == kv.getValue()){
                counter+=kv.getValue();
            }
        }

        System.out.println(counter);
    }
}
