package com.cozzycoder.revision.dataStructure.twoPointers;

public class SortedTwoSum {

    public static void main(String[] args) {

        System.out.println(twoSum());
    }

    private static boolean twoSum() {
        int [] arr = {1, 2, 4, 6, 8, 9, 14, 15};
        int target = 13;

        int start = 0;
        int end = arr.length  - 1;

        while (start < end){

            if(arr[end] > target){
                end--;
                continue;
            }

            if(arr[end] + arr[start] == target){
                return true;
            }

            if(arr[start] + arr[end] > target){
                end--;
            }else {
                start++;
            }
        }

        return false;
    }
}
