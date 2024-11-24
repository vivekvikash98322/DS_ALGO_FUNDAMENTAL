package com.cozzycoder.dataStructure.hashing.counting;

public class EqualZeroAndOneSubArray {

    public static void main(String[] args) {

        int [] nums = new int [] {0,1};
        int [] map = new int[2];

        int start =0;
        int end = 0;
        int max = 0;

        while(end < nums.length) {

            map[nums[end]]++;

            while(map[0] != map[1]){
                map[nums[start]]--;
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        System.out.println(max);
    }
}
