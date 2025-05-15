package com.cozzycoder.revision.dataStructure.twoPointers;

public class ReversePrefixOfWord {

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }

    public static String reversePrefix(String word, char ch) {

        int end = 0;
        char c [] = word.toCharArray();
        while(end < word.length()){

            if(word.charAt(end) == ch){
                int temp = end;
                int start = 0;
                while(temp > start){
                    char val = c[start];
                    c[start] = c[temp];
                    c[end]= val;
                    temp--;
                    start++;
                }

                break;
            }

            end++;
        }


        return new String(c);
    }
}
