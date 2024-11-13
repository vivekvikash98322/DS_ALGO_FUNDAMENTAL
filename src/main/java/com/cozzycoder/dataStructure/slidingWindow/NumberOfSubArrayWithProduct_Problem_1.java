package com.cozzycoder.dataStructure.slidingWindow;

public class NumberOfSubArrayWithProduct_Problem_1 {

    public static void main(String[] args) {

        int [] nums  = new int [] {10, 5, 2, 6};
        int k = 100;
        int right = 0;
        int left = 0;
        int number = 0;
        int product = 1;

        while(right < nums.length) {

            product *= nums[right];

            while(product >= k) {
                product /= nums[left];
                left++;
            }

            number += right - left + 1;
            right++;
        }

        System.out.println(number);
    }
}
