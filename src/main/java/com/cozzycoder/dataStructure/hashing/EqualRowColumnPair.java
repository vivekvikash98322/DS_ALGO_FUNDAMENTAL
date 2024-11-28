package com.cozzycoder.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class EqualRowColumnPair {

    public static void main(String[] args) {
        int[][] grid = new int [][] {{3,1,2, 2},{1,4, 4,5},{2,4,2, 2}, {2, 4, 2, 2}};
        Map<String, Integer> rowmap = new HashMap<>();
        Map<String, Integer> colMap = new HashMap<>();
        int ans = 0;

        for(int i = 0; i < grid.length; i++){
            String rowConcat = concat(grid[i]);
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                stringBuilder.append(grid[j][i]);
                stringBuilder.append(",");
            }

            rowmap.put(rowConcat, rowmap.getOrDefault(rowConcat, 0) + 1);
            colMap.put(stringBuilder.toString(), colMap.getOrDefault(stringBuilder.toString(), 0) + 1);

        }


        for(String key : rowmap.keySet()){

            if(colMap.containsKey(key)){
                ans +=(colMap.get(key) * rowmap.get(key));
            }
        }

        System.out.println(ans);
    }

    private static String concat(int[] ints) {
        StringBuilder  builder = new StringBuilder();

        for(int i : ints){
            builder.append(i);
            builder.append(",");
        }

        return builder.toString();
    }
}
