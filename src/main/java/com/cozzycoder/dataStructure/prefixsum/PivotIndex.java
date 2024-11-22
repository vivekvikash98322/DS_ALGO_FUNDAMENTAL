package com.cozzycoder.dataStructure.prefixsum;

public class PivotIndex {

    public static void main(String[] args) {

        int [] nums  = new int [] {1,7,3,6,5,6};
        int sum  = 0;
        int leftSum = 0;
        int pivotIndex = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {

            sum -= nums[i];

            if(leftSum == sum) {
                pivotIndex = i;
                break;
            }

            leftSum += nums[i];
        }

        System.out.println(pivotIndex);
    }
}
