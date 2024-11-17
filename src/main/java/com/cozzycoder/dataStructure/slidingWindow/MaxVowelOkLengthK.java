package com.cozzycoder.dataStructure.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaxVowelOkLengthK {

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;
        Map<Character, Character> characterObjectMap = Map.of('a', ' ', 'e', ' ', 'i', ' ', 'o', ' ', 'u', ' ');

        int start = 0;
        int end = 0;
        int vowelCount = 0;
        int max = 0;
        while(end < k) {

            if(characterObjectMap.containsKey(s.charAt(end))) {
                vowelCount++;
            }

            end++;
        }

        max = Math.max(max, vowelCount);

        while (end < s.length()) {

            if(characterObjectMap.containsKey(s.charAt(start))) {
                vowelCount--;
            }

            if(characterObjectMap.containsKey(s.charAt(end))) {
                vowelCount++;
            }

            max = Math.max(max, vowelCount);

            start++;
            end++;
        }

        System.out.println(max);

    }
}
