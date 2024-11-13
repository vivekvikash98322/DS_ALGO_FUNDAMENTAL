package com.cozzycoder.dataStructure.slidingWindow;

public class LengthOfLongestSubArray_Problem1 {

    public static void main(String[] args) {

        int [] nums = new int[] {3, 1, 2, 7, 4, 2, 1, 1, 5};

        int left = 0;
        int right = 0;
        int sum = 0;
        int k = 8;
        int length = 0;
        while (right < nums.length){

            sum += nums[right];

            while(sum > k){
                sum -=nums[left];
                left++;
            }

            length = Math.max(length, right - left + 1);
            right++;
        }

        System.out.println(length);

    }
}
