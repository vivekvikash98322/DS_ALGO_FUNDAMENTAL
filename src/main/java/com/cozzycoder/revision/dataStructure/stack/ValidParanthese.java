package com.cozzycoder.revision.dataStructure.stack;

import java.util.Map;

public class ValidParanthese {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
                '}', '{',
                ']', '[',
                ')', '(');
        ;

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if(!stringBuilder.isEmpty() && map.containsKey(s.charAt(i))) {
                Character c = map.get(s.charAt(i));

                if(c != stringBuilder.charAt(stringBuilder.length() - 1)) {
                    return false;
                }

                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                continue;
            }

            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.isEmpty();
    }
}
