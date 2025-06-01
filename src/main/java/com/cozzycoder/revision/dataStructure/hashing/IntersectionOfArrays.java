package com.cozzycoder.revision.dataStructure.hashing;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        System.out.println(intersection(new int [][] {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}}));
    }

    public static List<Integer> intersection(int[][] nums) {

        int [] sortedArray = new int [1001];
        List<Integer> ans =  new ArrayList<>();
        for (int [] loopedArray : nums){

            for (int i = 0; i < loopedArray.length; i++) {
                sortedArray[loopedArray[i]]++;
            }
        }


        for (int i = 0; i < sortedArray.length; i++) {
            if(sortedArray[i] == nums.length){
                ans.add(i);
            }
        }

        return ans;
    }
}
