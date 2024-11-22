package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstOccuranceOfChar {

    public static void main(String[] args) {

        //System.out.println(solution_1("abccbaacz"));
        System.out.println(solution_2("abccbaacz"));

    }


    public static Character solution_1(String s){

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        Character ans  = ' ';
        for (int i = 0; i < s.length(); i++) {
            Integer ch = characterIntegerMap.get(s.charAt(i));
            if(ch != null &&  ++ch == 2 ){
                ans =  s.charAt(i);
                break;
            }

            characterIntegerMap.put(s.charAt(i), characterIntegerMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        return ans;
    }

    public static Character solution_2(String s){

        int [] characterIntegerMap = new int [26];
        Character ans  = ' ';
        for (int i = 0; i < s.length(); i++) {
            Integer ch = characterIntegerMap[s.charAt(i) - 'a'];
            if(++ch == 2){
                ans =  s.charAt(i);
                break;
            }

            characterIntegerMap[s.charAt(i) - 'a'] = ++characterIntegerMap[s.charAt(i) - 'a'];
        }

        return ans;
    }
}
