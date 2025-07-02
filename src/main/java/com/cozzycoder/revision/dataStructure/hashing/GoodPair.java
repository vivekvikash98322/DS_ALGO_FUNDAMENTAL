package com.cozzycoder.revision.dataStructure.hashing;

public class GoodPair {

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int []{1, 2, 3, 1, 1, 3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        int [] map = new int[101];

        for (int i = 0; i < nums.length; i++) {
            map[nums[i]]++;
        }

        int counter = 0;
        for (int i = 0; i < map.length; i++) {

            if(map[i] > 1){
                int n = map[i];
                counter += (n*(n- 1)/2);
            }
        }

        return counter;
    }
}
