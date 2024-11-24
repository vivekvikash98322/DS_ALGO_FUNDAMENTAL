package com.cozzycoder.dataStructure.hashing;

public class CountingElement {

    public static void main(String[] args) {

        int [] arr = new int []{1000,1,0,999,555};
        boolean [] nums  = new boolean [1002];
        int end = arr.length - 1;
        int start = 0;

        while(end >= start) {
            nums[arr[end]] = true;
            nums[arr[start]] = true;

            start++;
            end--;
        }

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {

            if(nums[arr[i] + 1]){
                counter++;
            }

        }

        System.out.println(counter);

    }
}
