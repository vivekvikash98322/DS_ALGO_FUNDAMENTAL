package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class AllCharacterHaveEqualOccurance {

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc"));
    }

    public static boolean areOccurrencesEqual(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if(i == s.length() - 1){
                count = map.get(s.charAt(i));
            }
        }

       for (int value : map.values()) {
           if(value != count) return false;
       }

        return true;
    }
}
