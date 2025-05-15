package com.cozzycoder.revision.dataStructure.slidingWindow;

public class MaxConsicutiveOne_Problem_1 {

    public static void main(String[] args) {

        System.out.println(longestOnes(new int [] {1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

    public static int longestOnes(int[] nums, int k) {

        int arr [] = new int [nums.length];
        int start = 0;
        int end = 0;
        int zeroCount = 0;
        int lastZeroIndex = 0;
        int index = 0;
        int lenght = nums.length;
        int maxLength = 0;
        while(end < lenght){

            if(nums[end] == 0) {
                arr[lastZeroIndex] = end;
                lastZeroIndex++;
                zeroCount++;
            }

            if(zeroCount > k){
                zeroCount--;
                start = arr[index] + 1;
                index++;
            }

            maxLength = Math.max(maxLength, end - start +1);
            end++;
        }

        return maxLength;
    }
}
