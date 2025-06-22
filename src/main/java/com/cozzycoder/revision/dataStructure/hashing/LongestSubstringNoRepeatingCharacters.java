package com.cozzycoder.revision.dataStructure.hashing;

public class LongestSubstringNoRepeatingCharacters {


    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring(" "));
    }

    public static int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = 0;

        int max = 0;

        int [] seen = new int[150];
        int length = s.length();

        while(end < length) {

            while(seen[s.charAt(end)] == 1 && start < length) {
                seen[s.charAt(start)]--;
                start++;
            }

            seen[s.charAt(end)]++;
            max = Math.max(max, end - start + 1);
            end++;
        }

        return max;

    }
}
