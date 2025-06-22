package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class MinimumCosicutiveCardToPick {

    public static void main(String[] args) {
        System.out.println(minimumCardPickup(new int [] {3,4,2,3,4,7}));
    }

    public static int minimumCardPickup(int[] cards) {

        int end = 0;
        int min  = Integer.MAX_VALUE;
        int length = cards.length;
        Map<Integer, Integer> map = new HashMap<>();

        while(end < length) {

            if(map.containsKey(cards[end])) {
                min = Math.min(min, end - map.get(cards[end]) + 1);
            }

            map.put(cards[end], end);
            end++;
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

}
