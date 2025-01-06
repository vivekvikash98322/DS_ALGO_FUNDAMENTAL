package com.cozzycoder.dataStructure.stack;

public class BackspaceStringCompare {

    public static void main(String[] args) {

        String s  = "a##c";
        String t = "#a#c";

        System.out.println(transform(s).equals(transform(t)));
    }

    public static String transform(String s) {
        
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (!stringBuilder.isEmpty() && c == '#') {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                continue;
            } else if (c != '#') {
                stringBuilder.append(c);
            }
        }


        return stringBuilder.toString();
    }
}
