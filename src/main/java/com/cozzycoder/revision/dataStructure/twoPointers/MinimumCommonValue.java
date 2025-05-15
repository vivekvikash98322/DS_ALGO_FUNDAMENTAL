package com.cozzycoder.revision.dataStructure.twoPointers;

public class MinimumCommonValue {

    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1,2,3,6}, new int[] {2,3,4,5}));
    }

    public static int getCommon(int[] nums1, int[] nums2) {

        int start = 0;
        int start_1 = 0;
        int length = nums1.length;
        int length_1 = nums2.length;

        while(start < length && start_1 < length_1) {

            if(nums1[start] > nums2[start_1]) {
                start_1++;
                continue;
            } if(nums1[start] < nums2[start_1]) {
                start++;
                continue;
            }else if(nums1[start] == nums2[start_1]){
                return nums1[start];
            }

            start_1++;
            start++;
        }

        return -1;
    }
}
