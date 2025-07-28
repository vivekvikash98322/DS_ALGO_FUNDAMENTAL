package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestSubArrayWithMaxAbosulteDifference {

    public static void main(String[] args) {

    }

    public static int longestSubarray(int[] nums, int limit) {

        Deque<Integer> increase = new ArrayDeque<>();
        Deque<Integer> decreasing = new ArrayDeque<>();

        int end = 0;
        int start = 0;
        int max = 0;
        while (end < nums.length) {


            while (!increase.isEmpty() && increase.peekLast() > nums[end]) {
                increase.removeLast();
            }

            while (!decreasing.isEmpty() && decreasing.peekLast() < nums[end]) {
                decreasing.removeLast();
            }

            increase.offerLast(nums[end]);
            decreasing.offerLast(nums[end]);

            while (decreasing.peekFirst() - increase.peekFirst() > limit) {

                if(!increase.isEmpty() && increase.peekFirst()  == nums[start]) {
                    increase.removeFirst();
                }

                if(!decreasing.isEmpty() && decreasing.peekFirst()  == nums[start]) {
                    decreasing.removeFirst();
                }

                start++;
            }

            max  = Math.max(max, end - start + 1);

            end++;
        }

        return max;
    }
}
