package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.Stack;

public class FinalPriceSpecialDiscount {

    public static void main(String[] args) {
        System.out.println(finalPrices(new int[]{10,1,1,6}));
    }

    public static int[] finalPrices(int[] prices) {

        Stack<Integer> increasing = new Stack<>();
        for (int i = 0; i < prices.length; i++) {

            while(!increasing.isEmpty() && prices[increasing.peek()] >= prices[i]) {
                prices[increasing.peek()] = prices[increasing.pop()] - prices[i];
            }

            increasing.push(i);
        }

        return prices;
    }
}
