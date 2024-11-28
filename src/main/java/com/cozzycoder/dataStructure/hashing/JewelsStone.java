package com.cozzycoder.dataStructure.hashing;

import java.util.HashSet;
import java.util.Set;

public class JewelsStone {

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbbb";
        Set<Character> set = new HashSet<>();
        int ans = 0;
        for(char c : jewels.toCharArray()){
            set.add(c);
        }

        for(char c : stones.toCharArray()) {
            if(set.contains(c)){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
