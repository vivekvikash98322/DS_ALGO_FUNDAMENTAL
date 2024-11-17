package com.cozzycoder.dataStructure.slidingWindow;

public class MinimumLengthArray {

    public static void main(String[] args) {

        int [] nums  = new int [] {2,3,1,2,4,3};
        int target  = 7;

        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(right < nums.length) {

            sum += nums[right];

            while(sum >= target) {

                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }

            right++;
        }

        System.out.println(min);
    }
}
