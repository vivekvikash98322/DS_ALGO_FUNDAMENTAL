package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraySum {

    public static void main(String[] args) {
//        System.out.println(numSubarraysWithSum(new int[]{0,0,0,0,0}, 0));
//        System.out.println(numSubarraysWithSum_2(new int[]{0,0,0,0,0}, 0));
        System.out.println(numSubarraysWithSum_3(new int[]{0,0,0,0,0,0,1,0,0,0}, 0));
    }

    public static int numSubarraysWithSum_3(int[] nums, int goal) {

        int start = 0;
        int length = nums.length;
        int end = 0;
        int ans = 0;
        int sum = 0 ;
        while (end < length) {

            sum += nums[end];

            while(start < end && sum > goal){
                sum -= nums[start];
                start++;
            }


            if(sum == goal) {

                int firstOne = start;

                while(firstOne < end && nums[firstOne]== 0) {
                    firstOne++;
                }

                ans += firstOne - start + 1;
            }

            end++;

        }
        return ans;
    }

    public static int numSubarraysWithSum_2(int[] nums, int goal) {

        int end = 0;
        int ans = 0;
        int sum  = 0;
        int start = 0;
        int prefix = 0;
        int length  = nums.length;
        while(end < length) {

            sum += nums[end];


            if(sum == goal) {

                while (start < end && sum >= goal) {
                    if(nums[prefix] == 1) {
                        prefix = 0;
                    }else {
                        prefix++;
                    }

                    sum -= nums[prefix];
                    start++;

                }

                ans += 1 + prefix;
            }

            end++;
        }

        return ans;
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {

        Map<Integer, Integer> map = new HashMap<>();

        int end = 0;
        int ans = 0;
        int sum  = 0;
        int length  = nums.length;
        map.put(0, 1);

        while(end < nums.length) {

            sum += nums[end];

            if(map.containsKey(sum - goal)) {
                ans += map.get(sum -goal);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
            end++;
        }

        return ans;
    }

}
