package com.cozzycoder.revision.dataStructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    Queue<Integer> queue;
    int Queuesize = 0;
    int sum = 0;
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        Queuesize = size;
    }

    public double next(int val) {

        int reduceSum = 0;
        queue.offer(val);
        while(!queue.isEmpty() && Queuesize < queue.size()) {
            reduceSum += queue.poll();
        }

        sum += (val - reduceSum);

        return (double) sum / queue.size();
    }

    public static void main(String[] args) {

        MovingAverage movingAverage = new MovingAverage(3);
        int [] arr = new int [] {1, 10, 3, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(movingAverage.next(arr[i]));
        }
    }

}
