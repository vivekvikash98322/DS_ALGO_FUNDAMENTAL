package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MaxSumPair {

    public static void main(String[] args) {

        int [] nums = new int [] {368,369,307,304,384,138,90,279,35,396,114,328,251,364,300,191,438,467,183};

        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;

        Function<Integer, Integer> integerPredicate = (Integer num) -> {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
            return sum;
        };

        for (int i = 0; i < nums.length; i++) {
            int digitSum = integerPredicate.apply(nums[i]);
            if (map.containsKey(digitSum)) {
                int value = map.get(digitSum);
                max = Math.max(max, value + nums[i]);
                map.put(digitSum, Math.max(value, nums[i]));
                continue;
            }

            map.put(digitSum, nums[i]);
        }

        System.out.println(max);;
    }
}
