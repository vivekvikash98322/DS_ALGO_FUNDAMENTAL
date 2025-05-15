package com.cozzycoder.revision.dataStructure.prefixSum;

public class NumberOfWayToSplitArray {

    public static void main(String[] args) {

        System.out.println(waysToSplitArray(new int [] {10,4,-8,7}));
    }

    public static int waysToSplitArray(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
             sum -= nums[i];
             leftSum += nums[i];
             if(sum < leftSum){
                 count++;
             }
        }

        return count;
    }
}
