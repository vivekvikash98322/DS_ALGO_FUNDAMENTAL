package com.cozzycoder.dataStructure.twoPointer;

public class MinimumCommonValueInTwoArray {

    public static void main(String[] args) {

        int [] nums1 = new int [] {1, 2, 3};
        int [] nums2 = new int [] {2, 4};


        int num1Start = 0;
        int num2Start = 0;
        int ans  = -1;
        while(num1Start < nums1.length && num2Start < nums2.length){

            if(nums1[num1Start] > nums2[num2Start]) {
                num2Start++;
                continue;
            }else if(nums1[num1Start] < nums2[num2Start]) {
                num1Start++;
                continue;
            }

            ans = nums1[num1Start];
            break;
        }

        System.out.println(ans);
    }
}
