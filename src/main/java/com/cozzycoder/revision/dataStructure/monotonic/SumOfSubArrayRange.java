package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubArrayRange {

    public static void main(String[] args) {
        int arr [] = new int [] {4,-2,-3,4,1};
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

        long answer = 0;

        for (int i = 0; i < arr.length; ++i) {
            answer += (long) (i - leftMin[i]) * (rightMin[i] - i) * arr[i] ;
        }

        minStack.clear();

        Arrays.fill(leftMin, -1);
        Arrays.fill(rightMin, arr.length);

        for (int i = 0; i < arr.length; i++) {

            while (!minStack.isEmpty() && arr[minStack.peek()] < arr[i]) {
                int index = minStack.pop();
                rightMin[index] = i;
            }

            if (!minStack.isEmpty()) {
                leftMin[i] = minStack.peek();
            }
            minStack.push(i);
        }

        long answer_2 = 0;

        for (int i = 0; i < arr.length; ++i) {
            answer_2 += (long) (i - leftMin[i]) * (rightMin[i] - i) * arr[i];
        }


        System.out.println(answer_2 - answer);
    }

}
