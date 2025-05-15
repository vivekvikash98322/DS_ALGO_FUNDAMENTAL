package com.cozzycoder.revision.dataStructure.twoPointers;

public class ReverseString_Problem_2 {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {

        char [] array = s.toCharArray();

        int end = 0;
        int preEnd = end + 1;
        int start = 0;

        while(preEnd <= s.length()){

            if(preEnd == s.length() || s.charAt(preEnd) == ' '){
                int lastIndex = end;
                int startIndex = start;
                while(lastIndex  > startIndex){
                    char c  = array[lastIndex];
                    array[lastIndex] = array[startIndex];
                    array[startIndex] = c;
                    lastIndex--;
                    startIndex++;
                }

                start = preEnd + 1;
            }

            end++;
            preEnd++;
        }

        return new String(array);
    }
}
