package com.cozzycoder.revision.dataStructure.slidingWindow;

public class SubArrayWithProductLessThenK {

    public static void main(String[] args) {

        System.out.println(numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));

    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        int start = 0;
        int end = 0;
        int product = 1;
        int length = nums.length;
        int count = 0;
        while(end < length) {

            product *= nums[end];

            while(product >= k){
                product /= nums[start];
                start++;
            }

            count += (end - start + 1);
            end++;
        }

        return count;
    }
}
