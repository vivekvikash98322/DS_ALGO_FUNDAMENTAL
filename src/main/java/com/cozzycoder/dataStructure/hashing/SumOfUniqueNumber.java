package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumOfUniqueNumber {

    public static void main(String[] args) {

        int [] nums = new int [] {10,6,9,6,9,6,8,7};
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int num : nums){
            Integer value = map.get(num);
            if(value != null){
                sum -= value;
                map.put(num, 0);
                continue;
            }

            map.put(num, num);
            sum += num;
        }

        System.out.println(sum);
    }
}
