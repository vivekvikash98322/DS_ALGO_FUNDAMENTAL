package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.Stack;

public class LexographicallySmallestString {

    public static void main(String[] args) {
        System.out.println(robotWithString("bdda"));
    }

    public static String robotWithString(String s) {

        int [] arr = new int [26];
        char [] c = s.toCharArray();
        Stack<Character> characters = new Stack<>();
        for (char val : c) {
            arr[val - 'a']++;
        }


        char minChar = 'a';
        StringBuilder stringBuilder = new StringBuilder();
        for (char val : c) {

            characters.push(val);
            arr[val - 'a']--;

            while (minChar != 'z' && arr[minChar - 'a'] == 0){
                minChar++;
            }

            while(!characters.isEmpty() && characters.peek() <= minChar) {
                stringBuilder.append(characters.pop());
            }

        }

        return stringBuilder.toString();
    }
}
