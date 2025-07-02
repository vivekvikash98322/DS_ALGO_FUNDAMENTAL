package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PathCrossing {

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NES"));
    }

    public static boolean isPathCrossing(String path) {
        int [][] directionMap =  new int[26][2];
        directionMap['N' - 'A'] = new int[] {0, 1};
        directionMap['S' - 'A'] = new int[] {0, -1};
        directionMap['E' - 'A'] = new int[] {1, 0};
        directionMap['W' - 'A'] = new int[] {-1, 0};

        Set<String> map = new HashSet<>();
        int x = 0;
        int y = 0;

        map.add(x + "-" + y);
        for (char c : path.toCharArray()){
            int [] val = directionMap[c - 'A'];
            x += val[0];
            y += val[1];
            String combined = x + "-" + y;
            if(!map.add(combined)) {
                return true;
            }
        }

        return false;
    }
}
