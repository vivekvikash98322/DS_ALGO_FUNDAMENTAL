package com.cozzycoder.revision.dataStructure.twoPointers;

public class MoveZeroToEnd {

    public static void main(String[] args) {

        System.out.println(moveZeroes(new int [] {0,1,0,3,12}));
    }

    public static int [] moveZeroes(int[] nums) {

        int start = 0;
        int end = 0;

        while(end < nums.length){

           if(nums[end] == 0){
               end++;
               continue;
           }

            nums[start] = nums[end];
            start++;
            end++;
        }

        while (start < nums.length){
            nums[start] = 0;
            start++;
        }

        return nums;
    }
}
