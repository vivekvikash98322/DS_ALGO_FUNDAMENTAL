package com.cozzycoder.revision.dataStructure.hashing;

import java.lang.reflect.Array;
import java.util.*;

public class EqualRowAndColumnPair {

    public static void main(String[] args) {
        System.out.println(equalPairs(new int [][]{{3,2,1},{1,7,6},{2,7,7}}));
    }

    public static int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder [] column = new StringBuilder[grid[0].length] ;

        for (int i = 0; i < grid.length; i++) {

            String value = join(grid[i]);
            map.put(value, map.getOrDefault(value, 0) + 1);
            for (int j = 0; j < grid[i].length; j++) {
                if(column[j] == null){
                    column[j] =  new StringBuilder();
                }

                column[j].append(grid[i][j]);
            }
        }


        int count = 0;
        for (int i = 0; i < column.length; i++) {
            if(map.containsKey(column[i].toString())){
                count+= map.get(column[i].toString());
            }
        }

        return count;
    }

    public static String join(int [] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
