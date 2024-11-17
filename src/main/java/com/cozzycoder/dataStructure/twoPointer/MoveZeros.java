package com.cozzycoder.dataStructure.twoPointer;

public class MoveZeros {

    public static void main(String[] args) {

        int [] nums  = new int [] {0, 1, 0, 3, 12};

        approch_1(nums);
        System.out.println("************************8");
        approch_2(nums);
    }

    private static void approch_2(int [] nums) {

        int left = 0;
        int right = 0;

        while(right < nums.length ) {

            if(nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                right++;
                left++;
                continue;
            }

            right++;
        }

        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static void approch_1(int[] nums) {
        int left = 0;
        int right = 0;

        while(right < nums.length) {

            if(nums[left] == 0 && nums[right] == 0){
                right++;
                continue;
            }else if(nums[left] == 0 && nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right++;
                continue;
            }

            right++;
            left++;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
