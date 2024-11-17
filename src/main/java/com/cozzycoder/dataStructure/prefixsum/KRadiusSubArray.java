package com.cozzycoder.dataStructure.prefixsum;

import java.util.Arrays;

public class KRadiusSubArray {

    public static void main(String[] args) {

        int[] nums = new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        int[] ans = new int[nums.length];
        int size = 2 * k + 1;
        int sum = 0;

        Arrays.fill(ans, -1);

        if(nums.length < k){
           // return ans;
            return;
        }

        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }

        ans[size - 1 - k] = sum/size;

        for (int i = size; i <nums.length ; i++) {
            sum += nums[i] - nums[i - size];
            ans[i - k] = sum/size;
        }

        for (int num : ans){
            System.out.print(num + " ");
        }

    }
}
