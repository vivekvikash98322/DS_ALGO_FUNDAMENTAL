package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {

        String ransomNote = "bg";
        String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println(ransomCheck(magazine, ransomNote));
        System.out.println(ransomCheck_2(magazine, ransomNote));

    }

    private static boolean ransomCheck_2(String magazine, String ransomNote) {
       int [] map = new int [26];

        if(magazine.length() < ransomNote.length()){
            return false;
        }

        for (int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i) - 'a']++;
        }


        for (char c : ransomNote.toCharArray()){

            if(map[c - 'a'] < 1) {
                return false;
            }

            map[c - 'a']--;
        }

        return true;
    }

    private static boolean ransomCheck(String magazine, String ransomNote) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magzineMap = new HashMap<>();

        if(magazine.length() < ransomNote.length()){
            return false;
        }

        for (int i = 0; i < magazine.length(); i++) {

            if(i < ransomNote.length()){
                ransomNoteMap.put(ransomNote.charAt(i), ransomNoteMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
            }

            magzineMap.put(magazine.charAt(i), magzineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }


        for (Map.Entry<Character, Integer> kv : ransomNoteMap.entrySet()){

            if(kv.getValue() > magzineMap.get(kv.getKey())) {
                return false;
            }
        }

        return true;
    }
}
