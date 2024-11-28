package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithOutRepeat {

    public static void main(String[] args) {
        String s = "abcabcbb";
        Map<Character, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
        int max = 0;

        while(end < s.length()) {

            if(map.containsKey(s.charAt(end))){
               start = map.get(s.charAt(end)) + 1;
            }

            map.put(s.charAt(end), end);
            max= Math.max(max, end - start + 1 );
            end++;
        }

        System.out.println(max);
    }
}
