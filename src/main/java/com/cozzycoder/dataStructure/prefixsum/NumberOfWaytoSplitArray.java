package com.cozzycoder.dataStructure.prefixsum;

public class NumberOfWaytoSplitArray {

    public static void main(String[] args) {

        int [] nums = new int []{10,4,-8,7};

        int [] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        int i = 0;
        int counter = 0;

        while(i < nums.length - 1){
            int rightSum = prefix[prefix.length - 1] - prefix[i];

            if(prefix[i] >= rightSum){
                counter++;
            }

            i++;
        }

        System.out.println(counter);

    }
}
