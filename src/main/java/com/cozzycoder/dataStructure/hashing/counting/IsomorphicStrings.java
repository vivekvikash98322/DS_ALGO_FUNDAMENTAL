package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic_2("paper", "title"));
    }

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            if(sMap.containsKey(s.charAt(i)) && sMap.get(s.charAt(i)) != t.charAt(i)
                    || tMap.containsKey(t.charAt(i)) && tMap.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }

            sMap.put(s.charAt(i), t.charAt(i));
            tMap.put(t.charAt(i), s.charAt(i));
        }

        return true;
    }

    public static boolean isIsomorphic_2(String s, String t) {

        if (s.length() != t.length())
            return false;

        Integer[] sMap = new Integer[128];

        for (int i = 0; i < s.length(); i++) {

            if (sMap[s.charAt(i)] != null && sMap[s.charAt(i)] != t.charAt(i)
                    || sMap[t.charAt(i)] != null && sMap[t.charAt(i)] != s.charAt(i)) {
                return false;
            }

            sMap[s.charAt(i)] = (int) t.charAt(i);
            sMap[t.charAt(i)] = (int) s.charAt(i);
        }

        return true;
    }
}
