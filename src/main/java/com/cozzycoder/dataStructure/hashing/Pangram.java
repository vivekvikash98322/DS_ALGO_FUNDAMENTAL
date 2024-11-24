package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        Map<Character, Character> characterSet = new HashMap<>();

        for (char c : str.toCharArray()){
            characterSet.put(c, ' ');
        }

        System.out.println(characterSet.size() == 26);
    }
}
