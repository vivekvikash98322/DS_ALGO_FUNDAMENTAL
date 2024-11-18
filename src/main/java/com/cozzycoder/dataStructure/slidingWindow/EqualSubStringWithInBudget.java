package com.cozzycoder.dataStructure.slidingWindow;

public class EqualSubStringWithInBudget {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;

        int start = 0;
        int end = 0;
        int sum = 0;
        int max  = 0;
        while(end < s.length()) {

            sum += Math.abs(s.charAt(end) - t.charAt(end));

            while(sum > maxCost) {
                sum -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            max = Math.max(max, end - start + 1);
            end++;
        }

        System.out.println(max);
    }
}
