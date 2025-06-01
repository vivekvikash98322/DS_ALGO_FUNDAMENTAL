package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString {

    public static void main(String[] args) {

        String str = "eceba";
        int k = 2;
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(end < str.length()){
            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);

            while(map.size() > k){

                if(map.get(str.charAt(start)) == 1){
                    map.remove(str.charAt(start));
                    start++;
                    continue;
                }

                map.put(str.charAt(start), map.getOrDefault(str.charAt(end), 0) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }

        System.out.println(maxLength);
    }


}
