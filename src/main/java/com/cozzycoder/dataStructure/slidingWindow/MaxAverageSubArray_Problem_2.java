package com.cozzycoder.dataStructure.slidingWindow;

public class MaxAverageSubArray_Problem_2 {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;

        int right = 0;
        double maxAvg = 0;
        int sum = 0;

        while (right < k) {
            sum += nums[right];
            right++;
        }

        maxAvg = (double) sum / k;

        while (right < nums.length) {
            sum += nums[right] - nums[right - k];
            maxAvg = (double) Math.max(maxAvg, (double) sum / k);
            right++;
        }

        System.out.println(maxAvg);
    }
}
