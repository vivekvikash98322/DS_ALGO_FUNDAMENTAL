package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NiceSumArray {

    public static void main(String[] args) {
        System.out.println(numberOfSubarrays_3(new int [] {4, 1, 2, 3, 7, 9, 1, 2, 8}, 2));
    }

    public static int numberOfSubarrays(int[] nums, int k) {

        int [] arr = new int [nums.length];
        int count = 0;
        int ans = 0;
        int length = nums.length;
        arr[0] = 1;
        for (int i = 0; i < length; i++) {

            count += nums[i] % 2;

            if(count - k >= 0 ){
                ans += arr[count - k];
            }

            arr[count]++;
        }

        return ans;
    }

    public static int numberOfSubarrays_2(int[] nums, int k) {

        Queue<Integer> integers = new LinkedList<>();

        int end = 0;
        int start = 0;
        int subArray = 0;
        while(end < nums.length){

            if(nums[end] % 2 != 0){
                integers.add(end);
            }


            if(integers.size() > k){
                start = integers.poll() + 1;
            }

            if(integers.size() == k){
                subArray += integers.element() - start + 1;
            }

            end++;
        }

        return subArray;
    }

    public static int numberOfSubarrays_3(int[] nums, int k) {

        int oddCount = 0;
        int end = 0;
        int start = 0;
        int subArray = 0;
        int evenNumber = 0;
        while(end < nums.length){


            oddCount += nums[end] % 2 ;


            if(oddCount == k){
                evenNumber = 0;

                while(oddCount == k){
                    oddCount -= nums[start] % 2;
                    start++;
                    evenNumber++;
                }
            }
            subArray += evenNumber;

            end++;
        }

        return subArray;
    }
}
