package com.cozzycoder.dataStructure.twoPointer;

public class Palindrome {

    /**
     * A string is palindrome only when it read same from backward.
     * To solve this we have to do following.
     * 1. Can take two pointer at each edge.
     * 2. Compare both edge at each iteration to check weather char match.
     * 3. if not return false otherwise true.
     * @param args
     */
    public static void main(String[] args) {

        String str  = "abcdcba";

        System.out.println("******** " + palindrome(str));

    }

    private static boolean palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while(start < end){

            if(str.charAt(start) != str.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
