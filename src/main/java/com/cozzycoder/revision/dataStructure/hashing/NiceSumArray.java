package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NiceSumArray {

    public static void main(String[] args) {
        System.out.println(solution_1(new int [] {4, 1, 2, 3, 7, 9, 1, 2, 8}, 2));
        System.out.println(solution_2(new int [] {4, 1, 2, 3, 7, 9, 1, 2, 8}, 2));
        System.out.println(solution_3(new int [] {4, 1, 2, 3, 7, 9, 1, 2, 8}, 2));
    }

    private static int solution_3(int[] nums, int k) {
        int start = 0;
        int length = nums.length;
        int end = 0;
        int ans = 0;
        int oddCount = 0 ;
        int gap = 0;
        while (end < length) {

            oddCount += nums[end] %2;

            if(oddCount == k) {
                gap = 0;
                while(oddCount >= k) {
                    oddCount -= nums[start] % 2;
                    start++;
                    gap++;

                }
            }

            ans += gap;

            end++;

        }
        return ans;
    }

    private static int solution_2(int[] nums, int k) {
        int start = 0;
        int length = nums.length;
        int end = 0;
        int ans = 0;
        int oddCount = 0 ;
        while (end < length) {

            oddCount += nums[end] %2;

            while(oddCount > k){
                oddCount -= nums[start] % 2;
                start++;
            }


            if(oddCount == k) {

                int firstOdd = start;

                while(nums[firstOdd] % 2 == 0) {
                    firstOdd++;
                }

                ans += firstOdd - start + 1;
            }

            end++;

        }
        return ans;
    }

    private static int solution_1(int[] nums, int k) {

        Queue<Integer> oddNumber = new LinkedList<>();
        int start = 0;
        int length = nums.length;
        int end = 0;
        int ans = 0;
        while(end < length) {

            if(nums[end] % 2 != 0) {
                oddNumber.add(end);
            }

            if(oddNumber.size() > k) {
                start = oddNumber.poll();
                start++;
            }

            if(oddNumber.size() == k) {
                ans += oddNumber.element() - start + 1;
            }

            end++;
        }

        return ans;

    }

}
