package com.cozzycoder.revision.dataStructure.slidingWindow;

public class MaxAvgSubArray_Problem_1 {

    public static void main(String[] args) {

        System.out.println(findMaxAverage(new int []{0,4,0,3,2}, 1));
    }


    public static double findMaxAverage(int[] nums, int k) {

        int sum  = 0;
        int maxSum = 0;
        int length = nums.length;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        for (int i = k; i < length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
