package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement_2 {

    public static void main(String[] args) {
        System.out.println(nextLargerElement(new int[] {6, 8, 0, 1, 3}));
    }

    public static ArrayList<Integer> nextLargerElement(int[] arr) {

        int [] ans = new int[arr.length];
        Stack<Integer> integers = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            ans[i] = -1;
            while (!integers.isEmpty() && arr[integers.peek()] < arr[i]) {
                ans[integers.pop()] = arr[i];
            }

            integers.push(i);
        }

        ArrayList<Integer> integers1 = new ArrayList<>();
        for (int i = 0; i < ans.length; i++) {
            integers1.add(ans[i]);
        }


        return integers1;
    }
}
