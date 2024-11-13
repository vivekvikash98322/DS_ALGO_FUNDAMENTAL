package com.cozzycoder.dataStructure.prefixsum;

public class QueriesAnswer {

    public static void main(String[] args) {

        int [] nums = new int [] {1, 6, 3, 2, 7, 2};//1, 7, 10, 12, 19, 21
        int [][] queries = new int [][]{{0, 3}, {2, 5}, {2, 4}};
        int limit = 13;

        int [] prefix  = new int[nums.length];
        boolean [] ans = new boolean [queries.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {
            int leftbond  = queries[i][0];
            int rightbond = queries[i][1];
            int sum = prefix[rightbond] - prefix[leftbond] + nums[leftbond];

            if(sum < limit){
                ans[i] = true;
                continue;
            }

            ans[i] = false;
        }


        for(boolean value : ans) {
            System.out.println(value);
        }

    }
}
