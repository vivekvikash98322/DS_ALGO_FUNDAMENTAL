package com.cozzycoder.revision.dataStructure.monotonic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Dota2Senate {

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDD"));
    }

    public static String predictPartyVictory(String senate) {
        Queue<Integer> rad =  new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int i = 0;

        for (; i < senate.length(); i++) {
            if(senate.charAt(i) == 'R'){
                rad.offer(i);
                continue;
            }

            dire.offer(i);
        }



        while(!rad.isEmpty() && !dire.isEmpty()) {

            if (rad.peek() < dire.peek()) {
                rad.poll();
                dire.poll();
                rad.offer(i++);
                continue;
            }

            dire.poll();
            rad.poll();
            dire.offer(i++);
        }


        return !rad.isEmpty() ? "Radiant" : "Dire";

    }
}
