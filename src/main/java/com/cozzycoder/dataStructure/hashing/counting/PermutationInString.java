package com.cozzycoder.dataStructure.hashing.counting;

import java.util.*;

public class PermutationInString {

    public static void main(String[] args) {
        String s1 = "abcdxabcde";
        String s2 = "abcdeabcdx";

        extracted_1(s1, s2);
        extracted_2(s1, s2);
    }

    private static void extracted_2(String s1, String s2) {

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> s2map = new HashMap<>();

        for (char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int end = 0;

        while(end < s2.length()) {

            s2map.put(s2.charAt(end), s2map.getOrDefault(s2.charAt(end), 0) + 1);

            while((end - start + 1) > s1.length()){
                s2map.put(s2.charAt(start), s2map.getOrDefault(s2.charAt(start), 0) - 1);
                start++;
            }

            if((end - start + 1) == s1.length()){

                int matchCount = 0;
                for (Map.Entry<Character, Integer> kv : map.entrySet()){

                    if(s2map.containsKey(kv.getKey()) && s2map.getOrDefault(kv.getKey(), 0) == kv.getValue()){
                        matchCount++;
                    }
                }

                if(matchCount == map.size()){
                    System.out.println(true);
                    break;
                }
            }


            end++;
        }
    }

    private static void extracted_1(String s1, String s2) {
        char [] str = s1.toCharArray();
        Arrays.sort(str);
        String sortedStrign  = new String(str);

        int start = 0;
        int end = 0;

        while(end < s2.length()) {

            while((end - start + 1) > s1.length()){
                start++;
            }

            if((end - start + 1) == s1.length()){

                char [] c = new char[s1.length()];
                int index  = 0;

                for(int i = start; i <= end; i++){
                   c[index] = s2.charAt(i);
                   index++;
                }

                Arrays.sort(c);
                if(sortedStrign.equals(new String(c))){
                    System.out.println(true);
                    break;
                }
            }

            end++;
        }
    }
}
