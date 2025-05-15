package com.cozzycoder.revision.dataStructure.twoPointers;

public class ReverseOnlyString {

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {

        int start = 0;
        int end = s.length() - 1;
       char [] c = new char[s.length()];

        while(start <= end){

            if(!Character.isLetter(s.charAt(end))) {
                c[end] = s.charAt(end);
                end--;
                continue;
            }else if(!Character.isLetter(s.charAt(start))) {
                c[start] = s.charAt(start);
                start++;
                continue;
            }

            c[end] = s.charAt(start);
            c[start] = s.charAt(end);
            start++;
            end--;
        }

        return new String(c);
    }
}
