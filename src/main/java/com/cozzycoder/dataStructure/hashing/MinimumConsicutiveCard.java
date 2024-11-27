package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class MinimumConsicutiveCard {

    public static void main(String[] args) {
        int [] cards = new int [] {3,4,2,3,4,7};
        Map<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;

        while(end < cards.length) {

            if(map.containsKey(cards[end])){
                min = Math.min(min, end - map.get(cards[end]) + 1);
            }

            map.put(cards[end], end);
            end++;
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}
