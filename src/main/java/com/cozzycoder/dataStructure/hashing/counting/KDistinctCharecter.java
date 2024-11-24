package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;

public class KDistinctCharecter {

    public static void main(String[] args) {

        solution_hashMap("eceba");
    }

    private static void solution_hashMap(String s) {

        Map<Character, Integer> map= new HashMap<>();
        int k= 2;
        int start = 0;
        int end = 0;
        int max = 0;

        while(end < s.length()){

            map.put(s.charAt(end), map.getOrDefault(s.charAt(end) ,  0) + 1);

            while(map.size() > k) {
                map.put(s.charAt(start), map.getOrDefault(s.charAt(start) ,  0) - 1);
                if(map.get(start) == null){
                    map.remove(s.charAt(start));
                }

                start++;
            }

            max = Math.max(max, end - start + 1);
            end++;

        }

        System.out.println(max);
    }
}
