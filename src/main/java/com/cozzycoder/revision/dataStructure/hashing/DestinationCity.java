package com.cozzycoder.revision.dataStructure.hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {

    public static void main(String[] args) {
        System.out.println(destCity(List.of(List.of("B", "C"), List.of("D", "B"), List.of("C", "A"))));
    }

    public static String destCity(List<List<String>> paths) {

        Map<String, String> map = new HashMap<>();

        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }

        String ans = "";
        for (Map.Entry<String, String> KV : map.entrySet()) {
            if(!map.containsKey(KV.getValue())) {
                ans = KV.getValue();
            }
        }

        return ans;
    }
}
