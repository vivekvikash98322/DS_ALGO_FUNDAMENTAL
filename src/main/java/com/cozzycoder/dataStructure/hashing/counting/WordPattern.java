package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(convert("abba").equals(convertString("dog dog dog dog")));

    }

    public static String convertString(String s){
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        StringBuilder builder = new StringBuilder();
        String splited [] = s.split(" ");
        for(int i = 0; i < splited.length; i++){

            if(!map.containsKey(splited[i])){
                map.put(splited[i], i);
            }

            builder.append(map.get(splited[i]));
            builder.append(" ");
        }

        return builder.toString();
    }

    public static String convert(String s){

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }

            builder.append(map.get(s.charAt(i)));
            builder.append(" ");
        }

        return builder.toString();
    }
}
