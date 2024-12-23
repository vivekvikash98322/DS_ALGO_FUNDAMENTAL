package com.cozzycoder.dataStructure.hashing.counting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckStringClose {

    public static final Map<Character, Integer> WORD_1_MAP = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(closeStrings("cabbba", "abbccc"));
    }

    public static boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length()){
            return false;
        }

        int [] word1Map = new int [26];
        int [] word2Map = new int [26];

        for (int i = 0; i < word1.length(); i++) {
            word1Map[word1.charAt(i) - 'a']++;
            word2Map[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word1.length(); i++) {

            if(word2Map[word1.charAt(i) - 'a'] == 0){
                return false;
            }
        }

        Arrays.sort(word1Map);
        Arrays.sort(word2Map);


        for (int i = 0; i < 26; i++) {

            if(word1Map[i] != 0 && word2Map[i] != 0 && word1Map[i] != word2Map[i]){
               return false;
            }

        }

        return true;
    }
}
