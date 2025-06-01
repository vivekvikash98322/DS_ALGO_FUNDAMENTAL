package com.cozzycoder.revision.dataStructure.hashing;

import java.util.Set;

public class CheckStringIsPanagram {

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public static boolean checkIfPangram(String sentence) {

        char [] map = new char[26];
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < sentence.length(); i++) {
            map[sentence.charAt(i) - 'a'] = sentence.charAt(i);
        }

        return str.equals(new String(map));
    }
}
