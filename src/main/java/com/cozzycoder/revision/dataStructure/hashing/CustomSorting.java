package com.cozzycoder.revision.dataStructure.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CustomSorting {

    public static void main(String[] args) {
        System.out.println(customSortString("bcafg", "abcd"));
    }

    public static String customSortString(String order, String s) {

        int [] map = new int [26];

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }


        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {

            int count = map[order.charAt(i) - 'a'];
            if(count != 0) {
                stringBuilder.append(Character.toString(order.charAt(i)).repeat(count));
                map[order.charAt(i) - 'a'] = 0;
            }
        }


        for (int i = 0; i < 26; i++) {

            if(map[i] != 0) {
                stringBuilder.append(Character.toString(i + 'a').repeat(map[i]));
            }
        }

        return stringBuilder.toString();
    }



}
