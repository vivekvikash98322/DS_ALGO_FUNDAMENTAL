package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.Stack;

public class ValidStackSequence {

    public static void main(String[] args) {
        System.out.println(validateStackSequences(new int[] {1,2,3,4,5}, new int[]{4,5,3,2,1}));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        int start = 0;
        Stack<Integer> stringBuilder = new Stack<>();

        for (int j : pushed) {

            stringBuilder.push(j);
            while (!stringBuilder.isEmpty() && stringBuilder.peek() == popped[start]) {
                stringBuilder.pop();
                start++;
            }
        }


        return stringBuilder.isEmpty();
    }
}
