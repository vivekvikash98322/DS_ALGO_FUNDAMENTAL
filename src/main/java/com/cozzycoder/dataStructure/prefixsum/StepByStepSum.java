package com.cozzycoder.dataStructure.prefixsum;

public class StepByStepSum {

    public static void main(String[] args) {

        int [] nums = new int [] {-3,2,-3,4,2};

        int lowestSum = 0;
        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            lowestSum = Math.min(lowestSum, runningSum);
        }

        if(lowestSum > 1) {
            System.out.println(1);
        }

        System.out.println(1 - (lowestSum));
    }
}
