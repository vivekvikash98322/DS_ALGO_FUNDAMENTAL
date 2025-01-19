package com.cozzycoder.dataStructure.stack.monotonic;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax {

    public static void main(String[] args) {

        int [] nums = new int [] {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int [] ans  = new int [nums.length - k + 1];
        Deque<Integer> integers = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            while(!integers.isEmpty() && nums[integers.peekLast()] < nums[i]){
                integers.pollLast();
            }

            integers.offerLast(i);

            if(integers.peek() == i - k){
                integers.poll();
            }

            if(i - k + 1 >= 0){
                ans[i - k + 1] = nums[integers.peek()];
            }
        }

        System.out.println(ans);
    }
}
