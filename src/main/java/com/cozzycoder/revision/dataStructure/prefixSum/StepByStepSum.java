package com.cozzycoder.revision.dataStructure.prefixSum;

public class StepByStepSum {

    public static void main(String[] args) {

        System.out.println(minStartValue(new int [] {-3,2,-3,4,2}));
    }

    public static int minStartValue(int[] nums) {

        int lowestNumber = Integer.MAX_VALUE;
        int length = nums.length;
        int index  = 0;
        int sum = 0;
        while(index < length) {
            sum += nums[index];
            lowestNumber = Math.min(lowestNumber, sum);
            index++;
        };

        return 1 - lowestNumber;
    }
}
