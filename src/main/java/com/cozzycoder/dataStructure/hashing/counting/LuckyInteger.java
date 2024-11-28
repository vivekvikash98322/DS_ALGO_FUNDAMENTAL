package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {

    public static void main(String[] args) {

        int [] arr = new int [] {2, 2, 3, 4};

        Map<Integer, Integer> frequMap = new HashMap<>();
        int ans = -1;
        for (int num : arr){
            frequMap.put(num, frequMap.getOrDefault(num, 0) + 1);

            if(frequMap.get(num) == num){
                ans = num;
                break;
            }
        }
    }
}
