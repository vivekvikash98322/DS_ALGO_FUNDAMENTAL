package com.cozzycoder.revision.dataStructure.hashing;

import java.util.Arrays;
import java.util.Stack;

public class S2ContainsS1 {

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidboaoo"));
    }

    public static boolean checkInclusion(String s1, String s2) {

        StringBuilder builder = new StringBuilder();
        String sorted  = sort(s1);

        for (int i = 0; i < s1.length(); i++) {
            builder.append(s2.charAt(i));
        }

        if(sorted.equals(sort(builder.toString()))){
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            builder.deleteCharAt(0);
            builder.append(s2.charAt(i));

            if(sorted.equals(sort(builder.toString()))){
                return true;
            }
        }

        return false;
    }

    public static String sort(String s) {
        char a [] = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
