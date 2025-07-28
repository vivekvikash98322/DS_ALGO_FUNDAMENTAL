package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class NumberOfVisiblePersonInQueue {

    public static void main(String[] args) {
        System.out.println(canSeePersonsCount(new int[] {5,1,2,3,10}));
    }

    public static int[] canSeePersonsCount(int[] heights) {

        int [] ans = new int[heights.length];
        Stack<Integer> integers = new Stack<>();

        for (int i = 0; i < heights.length; i++) {

            while (!integers.isEmpty() && heights[integers.peek()] < heights[i]){
                int ele = integers.pop();
                ans[ele]++;
            }


            if(!integers.isEmpty() && heights[integers.peek()] >= heights[i]){
                ans[integers.peek()]++;
            }

            integers.push(i);
        }

        return ans;
    }
}
