package com.cozzycoder.revision.dataStructure.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {

    public static void main(String[] args) {
        System.out.println(frequencySort("tttree"));
    }

    public static String frequencySort(String s) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String c : s.split("")) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<String> group = new ArrayList<>(frequencyMap.keySet());
        group.sort((o1, o2) -> frequencyMap.get(o2) - frequencyMap.get(o1));

        StringBuilder builder = new StringBuilder();

        for (String value : group) {
            builder.append(value.repeat(frequencyMap.get(value)));
        }
        return builder.toString();


    }
}
