package com.cozzycoder.dataStructure.slidingWindow;

public class MaxAvgSubArray_1 {

    public static void main(String[] args) {

        int nums [] = {1,12,-5,-6,50,3};
        int k = 4;
        int sum = 0;
        double maxAvg = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;


        while(end < nums.length){
            sum += nums[end];

            if((end - start + 1) == k){
                maxAvg = Math.max(maxAvg, (double)sum / k);
                sum -= nums[start];
                start++;
            }

            end++;
        }

        System.out.println(maxAvg);
    }
}
