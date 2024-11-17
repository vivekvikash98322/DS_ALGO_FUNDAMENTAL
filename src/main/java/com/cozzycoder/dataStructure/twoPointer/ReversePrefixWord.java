package com.cozzycoder.dataStructure.twoPointer;

public class ReversePrefixWord {

    public static void main(String[] args) {

        String word  = "abcdefd";
        char ch = 'd';

        char array [] = word.toCharArray();

        int left = 0;
        int right = 0;

        while(right < array.length) {

            if(array[right] == ch) {

                while(left < right) {
                    char temp = array[right];
                    array[right] = array[left];
                    array[left] = temp;
                    right--;
                    left++;
                }
                break;
            }

            right++;
        }

        System.out.println(new String(array));

    }
}
