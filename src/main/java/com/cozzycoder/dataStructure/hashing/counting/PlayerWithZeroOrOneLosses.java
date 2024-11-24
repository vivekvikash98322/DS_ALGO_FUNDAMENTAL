package com.cozzycoder.dataStructure.hashing.counting;

import java.util.*;

public class PlayerWithZeroOrOneLosses {

    public static void main(String[] args) {

        int [][] matches = new int[][] {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};

        Map<Integer, int []> matchMap = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(0, new ArrayList<>());
        ans.add(1, new ArrayList<>());

        for (int [] match : matches) {

            matchMap.putIfAbsent(match[0], new int [2]);
            matchMap.putIfAbsent(match[1], new int [2]);

            int [] winner = matchMap.get(match[0]);
            winner[0]++;
            winner[1]++;

            int [] looser = matchMap.get(match[1]);
            looser[0]++;

        }

        for (Map.Entry<Integer, int []> kv : matchMap.entrySet()){

            if(kv.getValue()[0] == kv.getValue()[1]){
                ans.get(0).add(kv.getKey());
            } else if(kv.getValue()[0] - kv.getValue()[1] == 1){
                ans.get(1).add(kv.getKey());
            }

        }

        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));

        System.out.println(ans.toString());

    }
}
