package com.cozzycoder.revision.dataStructure.hashing;

import java.util.Arrays;

public class CloseString {

    public static void main(String[] args) {
        System.out.println(closeStrings("cabbba", "aabbss"));
    }

    public static boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length())  return false;

        int word1_map [] = new int [26];
        int word2_map [] = new int [26];

        for (int i = 0; i < word1.length(); i++) {
            word1_map[word1.charAt(i) - 'a']++;
            word2_map[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {

            if(word1_map[i] != 0 && word1_map[i] == 0) return false;
        }

        Arrays.sort(word1_map);
        Arrays.sort(word2_map);
        StringBuilder wor1Builder = new StringBuilder();
        StringBuilder wor2Builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if(word1_map[i] != 0) {
                wor1Builder.append(word1_map[i]);
            }
            if(word2_map[i] != 0) {
                wor2Builder.append(word2_map[i]);
            }
        }
        return wor2Builder.toString().contentEquals(wor1Builder);
    }
}
