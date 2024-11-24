package com.cozzycoder.dataStructure.hashing.counting;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int [][] nums = new int [][] {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        int [] arr = new int [1001];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                arr[nums[i][j]]++;

                if( arr[nums[i][j]] == nums.length) {
                    ans.add(nums[i][j]);
                }
            }
        }

        Collections.sort(ans);
        System.out.println(ans.toString());

    }
}
