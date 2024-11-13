package com.cozzycoder.dataStructure.slidingWindow;

public class MaxSumOfKLength {

    public static void main(String[] args) {
        int k = 4;
        int [] nums = new int[] {3, -1, 4, 12, -8, 5, 6};


        int right = 0;
        int max = 0 ;
        int sum = 0;

        while(right < k){
            sum += nums[right];
            right++;
        }

        max = sum;

        while(right < nums.length){
            sum += nums[right] - nums[right - k];
            sum = Math.max(max, sum);
            right++;
        }

        System.out.println(max);

    }
}
