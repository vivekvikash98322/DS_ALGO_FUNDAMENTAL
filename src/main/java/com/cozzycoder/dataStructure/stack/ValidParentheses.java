package com.cozzycoder.dataStructure.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "([])";
        System.out.println(validParan(str));
    }

    private static boolean validParan(String str) {
        Stack<Character> characterStack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i))) {
                char c  = map.get(str.charAt(i));
                if(c != characterStack.pop()){
                    return false;
                }

                continue;
            }

            characterStack.push(str.charAt(i));
        }

        return characterStack.isEmpty();
    }
}
