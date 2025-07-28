package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CompetativeSubsequence {

    public static void main(String[] args) {
        System.out.println(mostCompetitive(new int[]{71,18,52,29,55,73,24,42,66,8,80,2}, 3));
    }

    public static int[] mostCompetitive(int[] nums, int k) {

        Deque<Integer> integers = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while(!integers.isEmpty() && nums[integers.peekLast()] > nums[i] && i < (nums.length - k + integers.size())) {
               integers.removeLast();
            }

            integers.offerLast(i);
        }

        int [] ans = new int [k];
        int counter = 0;
        while (!integers.isEmpty() && counter != k){
            ans[counter++] = nums[integers.removeFirst()];
        }

        return ans;
    }
}
