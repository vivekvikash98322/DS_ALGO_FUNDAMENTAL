package com.cozzycoder.dataStructure.twoPointer;

public class ReverseCharInWord {

    public static void main(String[] args) {

       String s = "Let's take LeetCode contest";

       char [] str = s.toCharArray();
       StringBuilder stringBuilder = new StringBuilder();

       int right = 0;
       int left = 0;

       while(right < str.length) {

           if(str[right] == ' ' || right == str.length - 1) {
               int tempRight = str[right] == ' ' ? right - 1 : right;
               while(tempRight > left) {
                   char c = str[left];
                   str[left] = str[tempRight];
                   str[tempRight] = c;
                   tempRight--;
                   left++;
               }

               left = right + 1;
           }

           right++;
       }


        System.out.println(stringBuilder.append(str).toString());
    }
}
