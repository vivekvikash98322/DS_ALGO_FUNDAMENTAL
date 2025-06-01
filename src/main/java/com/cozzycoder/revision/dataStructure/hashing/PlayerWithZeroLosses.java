package com.cozzycoder.revision.dataStructure.hashing;

import java.util.*;

public class PlayerWithZeroLosses {

    public static void main(String[] args) {
        System.out.println(findWinners_2(new int[][] {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}}));
    }

    public static List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer, int []> integerPlayerMatchMappingMap = new HashMap<>();

        for (int [] match : matches){

            integerPlayerMatchMappingMap.putIfAbsent(match[0], new int [2]);
            integerPlayerMatchMappingMap.putIfAbsent(match[1], new int [2]);

            integerPlayerMatchMappingMap.get(match[0])[0]++;
            integerPlayerMatchMappingMap.get(match[0])[1]++;

            integerPlayerMatchMappingMap.get(match[1])[0]++;
        }

        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> wonAll = new ArrayList<>();
        List<Integer> lossOne = new ArrayList<>();

        for (Map.Entry<Integer, int[]> kv : integerPlayerMatchMappingMap.entrySet()) {

            if(kv.getValue()[0] == kv.getValue()[1]) {
                wonAll.add(kv.getKey());
            }

            if(kv.getValue()[0] - kv.getValue()[1] == 1) {
                lossOne.add(kv.getKey());
            }
        }

        Collections.sort(wonAll);
        Collections.sort(lossOne);

        lists.add(wonAll);
        lists.add(lossOne);
        return lists;
    }

    public static List<List<Integer>> findWinners_2(int[][] matches) {

       int maxVal = 0;

        for (int [] match : matches){

            if(match[0] > match[1]) {
                maxVal = Math.max(maxVal, match[0]);
                continue;
            }

            maxVal = Math.max(maxVal, match[1]);

        }

        int [][] ans = new int[maxVal + 1][2];

        for (int[] kv : matches) {

            ans[kv[0]][0]++;
            ans[kv[0]][1]++;

            ans[kv[1]][0]++;
        }


        List<List<Integer>> fnl = new ArrayList<>();
        fnl.add(new ArrayList<>());
        fnl.add(new ArrayList<>());
        for (int i = 0; i < ans.length; i++) {

            if(ans[i][0] != 0 && ans[i][0] == ans[i][1]){
                fnl.get(0).add(i);
            } else if(ans[i] != null && ans[i][0] - ans[i][1] == 1){
                fnl.get(1).add(i);
            }


        }

        return fnl;
    }
}

