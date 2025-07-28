package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.Stack;

public class DailyTemprature {

    public static void main(String[] args) {
        System.out.println(dailyTemperatures(new int [] {73,74,75,71,69,72,76,73}));
    }

    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> mono = new Stack<>();
        int [] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while(!mono.isEmpty() && temperatures[mono.peek()] < temperatures[i]) {
                System.out.println(temperatures[i] +" " + temperatures[mono.peek()]);
                int j = mono.pop();
                ans[j] = i - j;
            }

            mono.push(i);
        }

        return ans;
    }
}
