package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static  boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())  return false;

        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();

        int sStart = 0;
        int tStart = 0;

        while (sStart < s.length() && tStart < t.length()) {

            if((smap.containsKey(s.charAt(sStart))
                    && smap.get(s.charAt(sStart)) != t.charAt(tStart))
                    || (tmap.containsKey(t.charAt(tStart))
                    && tmap.get(t.charAt(tStart)) != s.charAt(sStart))) {
                return false;
            }

            smap.put(s.charAt(sStart), t.charAt(tStart));
            tmap.put(t.charAt(tStart), s.charAt(sStart));
            sStart++;
            tStart++;
        }


        return true;
    }

}
