package com.cozzycoder.dataStructure.twoPointer;

public class SortedTwoSum {

    /**
     * We have to find weather there exist a pair in sorted unique element array which sum up to target.
     *
     * To solve this we have to do following.
     *
     * 1. We take two pointer one at start and one at end.
     * 2. Compare if end pointer value is greater then target do end-- because we can to sum anything with it.
     * 3. otherwise check if sum of start + end in greater then target then move end pointer or ealse move start pointer.
     * @param args
     */
    public static void main(String[] args) {

        var array  = new int[]{1, 2, 3, 6, 8, 9, 14, 15};
        System.out.println(twoSum(array, 13));
    }

     static boolean twoSum(int [] array, int target){

        int start = 0;
        int end = array.length - 1;

        while (start < end){

            if(array[start]+ array[end] > target){
                end--;
            }else if(array[start]+ array[end] < target){
                start++;
            }else {
                return true;
            }
        }

        return false;
     }
}
