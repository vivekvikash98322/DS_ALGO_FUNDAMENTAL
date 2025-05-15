package com.cozzycoder.revision.dataStructure.slidingWindow;

public class BudgetString {

    public static void main(String[] args) {
        System.out.println(equalSubstring("abcd", "bcdf", 3));
    }

    public static int equalSubstring(String s, String t, int maxCost) {

        int s_end = 0;
        int start = 0;
        int slength = s.length();
        int maxLength = 0;
        int sum = 0;

        while(s_end < slength) {

            sum += Math.abs(s.charAt(s_end) - t.charAt(s_end));

            while(sum > maxCost){
                sum -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            maxLength = Math.max(maxLength, s_end - start + 1);
            s_end++;
        }

        return maxLength;
    }
}
