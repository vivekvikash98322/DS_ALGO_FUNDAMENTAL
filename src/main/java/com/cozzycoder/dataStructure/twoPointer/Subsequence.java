package com.cozzycoder.dataStructure.twoPointer;

public class Subsequence {

    public static void main(String[] args) {
        String t = "abc";
        String s = "ahbgdc";

        int i = 0, j = 0;


        while ( i < t.length() && j < s.length()){

            if(t.charAt(i) != s.charAt(j)){
                j++;
                continue;
            }

            i++;
            j++;
        }


        System.out.println(i == t.length());
    }
}
