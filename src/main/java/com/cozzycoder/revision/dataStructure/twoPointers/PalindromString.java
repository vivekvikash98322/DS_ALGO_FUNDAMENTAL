package com.cozzycoder.revision.dataStructure.twoPointers;

public class PalindromString {

    public static void main(String[] args) {

        String str = "abcdeba";
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if(str.charAt(start)!= str.charAt(end)){
                System.out.println("Not a palindrome number");
                break;
            }

            start++;
            end--;
        }

        if(start == end){
            System.out.println("Is a palindrome number");

        }
    }
}
