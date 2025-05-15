package com.cozzycoder.dataStructure.stack.monotonic;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] nums1 = new int [] {4, 1, 2};
        int[] nums2 = new int [] {1, 3, 4, 2};

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int [] ans = new int[nums1.length];
        for (int num : nums2){

            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }


        int index = 0;
        for (int num : nums1){
            ans[index] = map.getOrDefault(num, -1);
        }

        System.out.println(ans);

    }
}
