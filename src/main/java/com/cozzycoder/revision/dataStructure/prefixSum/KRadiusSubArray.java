package com.cozzycoder.revision.dataStructure.prefixSum;

import java.util.Arrays;

public class KRadiusSubArray {

    public static void main(String[] args) {
        System.out.println(getAverages(new int [] {7,4,3,9,1,8,5,2,6}, 3));
    }

    public static int[] getAverages(int[] nums, int k) {

        int [] ans = new int [nums.length];
        Arrays.fill(ans, -1);
        int radius = 2 * k ;
        int sum = 0;

        for (int i = 0; i <= radius ; i++){
            sum+= nums[i];
        }

        ans[radius - k] = sum/ ( radius + 1);

        for(int i = radius + 1; i < nums.length; i++ ){
            sum += (nums[i] - nums[i - (radius + 1)]);
            ans[i - k] = sum/ ( radius + 1);
        }

        return ans;
    }

}
