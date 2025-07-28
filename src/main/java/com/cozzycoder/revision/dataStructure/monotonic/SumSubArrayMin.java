package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.Arrays;
import java.util.Stack;

public class SumSubArrayMin {

    public static void main(String[] args) {
        System.out.println(sumSubarrayMins(new int [] {3,1,2,4}));
    }

    public static int sumSubarrayMins(int[] arr) {

        Stack<Integer> minStack = new Stack<>();

        int[] leftMin = new int[arr.length];
        int[] rightMin = new int[arr.length];

        Arrays.fill(leftMin, -1);
        Arrays.fill(rightMin, arr.length);

        for (int i = 0; i < arr.length; i++) {

            while (!minStack.isEmpty() && arr[minStack.peek()] > arr[i]) {
                int index = minStack.pop();
                rightMin[index] = i;
            }

            if (!minStack.isEmpty()) {
                leftMin[i] = minStack.peek();
            }
            minStack.push(i);
        }

        int mod = (int) 1e9 + 7;
        long answer = 0;

        for (int i = 0; i < arr.length; ++i) {
            answer += (long) (i - leftMin[i]) * (rightMin[i] - i) % mod * arr[i] % mod;
            answer %= mod;
        }

        return (int) answer;

    }
}
