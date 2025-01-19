package com.cozzycoder.dataStructure.stack.monotonic;

import java.util.Stack;

public class DailyTemprature {

    public static void main(String[] args) {

        int [] temperatures = new int []{73,74,75,71,69,72,76,73 };
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int [temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && stack.peek() < temperatures[i]){
                int index = stack.pop();
                ans[index] = i - index;
            }

            stack.push(i);
        }


    }
}
