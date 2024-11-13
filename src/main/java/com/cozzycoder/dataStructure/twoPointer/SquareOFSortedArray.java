package com.cozzycoder.dataStructure.twoPointer;

public class SquareOFSortedArray {

    public static void main(String[] args) {

        int[] array = new int [] {-4,-1,0,3,10};
        int[] finalArray = new int [array.length];

        int start = 0;
        int end = array.length - 1;
        int index = finalArray.length - 1;

        while (start < end) {
            int leftNumber = array[start] * array[start];
            int rightNumber = array[end] * array[end];

            if(leftNumber > rightNumber){
                finalArray[index] = leftNumber;
                start++;
                index--;
                continue;
            }

            finalArray[index] = rightNumber;
            end--;
            index--;
        }

        for (int number : finalArray){
            System.out.println(number);
        }

    }
}
