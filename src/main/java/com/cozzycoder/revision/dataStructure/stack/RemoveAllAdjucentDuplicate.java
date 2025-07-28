package com.cozzycoder.revision.dataStructure.stack;

public class RemoveAllAdjucentDuplicate {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }


    public static String removeDuplicates(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            int length = stringBuilder.length() - 1;
            if(!stringBuilder.isEmpty() && stringBuilder.charAt(length) == s.charAt(i)) {
                stringBuilder.deleteCharAt(length);
                continue;
            }

            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }
}
