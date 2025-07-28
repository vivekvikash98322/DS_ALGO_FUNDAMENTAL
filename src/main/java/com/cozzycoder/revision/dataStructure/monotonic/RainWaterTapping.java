package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.Stack;

public class RainWaterTapping {

    public static void main(String[] args) {
        int [] arr= new int [] {5,5,1,7,1,1,5,2,7,6};
        System.out.println(monotonicStackSolution(arr));
        System.out.println(twoPointer(arr));
    }

    private static int twoPointer(int[] height) {
        int leftMax = height[0];
        int rightMax = height[height.length - 1];

        int left = 0;
        int right = height.length - 1;
        int water = 0;
        while(left < right) {

            if(leftMax < rightMax){

                if(height[left] >= leftMax) {
                    leftMax = height[left];
                    continue;
                }

                water += leftMax - height[left];
                left++;
            }else {
                if(height[right] >= rightMax) {
                    rightMax = height[right];
                    continue;
                }

                water += rightMax - height[right];
                right--;
            }
        }

        return water;
    }

    private static int monotonicStackSolution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int res = 0;

        for (int i = 0; i < arr.length; i++) {

            // Pop all items smaller than arr[i]
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {

                int pop_height = arr[st.pop()];

                if (st.isEmpty())
                    break;

                // arr[i] is the next greater for the removed item
                // and new stack top is the previous greater
                int distance = i - st.peek() - 1;

                // Take the minimum of two heights (next and prev greater)
                int water = Math.min(arr[st.peek()], arr[i]);

                // Find the amount of water
                water -= pop_height;

                res += distance * water;
            }
            st.push(i);
        }
        return res;
    }
}
