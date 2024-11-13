package com.cozzycoder.dataStructure.slidingWindow;

public class FlipKZero {

    public static void main(String[] args) {
        int [] nums = new int [] {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int right = 0;
        int left = 0;
        int zeroCounter = 0;
        int maxOne = 0;


        while(right < nums.length){

            if(nums[right] == 0){
                zeroCounter += 1;
            }

            while(zeroCounter > k){

                if(nums[left] == 0){
                    zeroCounter -= 1;
                }
                left++;
            }

            maxOne = Math.max(maxOne, right - left + 1);
            right++;
        }

        System.out.println(maxOne);
    }
}
