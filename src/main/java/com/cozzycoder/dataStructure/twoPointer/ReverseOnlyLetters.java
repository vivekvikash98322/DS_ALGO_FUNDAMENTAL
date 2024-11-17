package com.cozzycoder.dataStructure.twoPointer;

public class ReverseOnlyLetters {

    public static void main(String[] args) {

        String s = "ab-cd";
        char [] c = s.toCharArray();

        int right = c.length - 1;
        int left = 0;

        while(left < right) {

            if(!Character.isAlphabetic(c[left])){
                left++;
                continue;
            }else if(!Character.isAlphabetic(c[right])){
                right--;
                continue;
            }

            char temp  = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }

        System.out.println(new String(c));
    }
}
