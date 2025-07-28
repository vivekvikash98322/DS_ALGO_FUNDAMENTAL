package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowMaxium {

    public static void main(String[] args) {
        System.out.println(maxSlidingWindow(new int [] {1,3,-1,-3,5,3,6,7}, 3));
    }


    public static int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> integers = new LinkedList<>();
        int [] ans = new int[nums.length - k + 1];

        for (int i = 0 ; i < nums.length; i++) {

            while (!integers.isEmpty() && nums[i] > nums[integers.peekLast()]) {
                integers.removeLast();
            }

            integers.offerLast(i);

           if(integers.peekFirst() == (i - k)){
               integers.removeFirst();
           }

           if((i - k + 1) >= 0) {
               ans[i - k + 1] = nums[integers.peekFirst()];
           }
        }

        return ans;
    }
}
