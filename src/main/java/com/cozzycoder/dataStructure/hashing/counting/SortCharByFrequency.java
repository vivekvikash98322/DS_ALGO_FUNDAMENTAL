package com.cozzycoder.dataStructure.hashing.counting;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortCharByFrequency {

    public static void main(String[] args) {

        String str = "tree";
        solution_1(str);
        solution_2(str);
    }

    private static void solution_2(String s) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for(String c: s.split("")){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<String> group = new ArrayList<>(frequencyMap.keySet());
         group.sort((o1, o2) -> frequencyMap.get(o2) - frequencyMap.get(o1));


        StringBuilder builder = new StringBuilder();

        for (String value : group){
            builder.append(value.repeat(frequencyMap.get(value)));
        }


        System.out.println(builder.toString());
    }

    private static void solution_1(String str) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        Map<Integer, List<String>> group = new HashMap<>();

        for(String c: str.split("")){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<String, Integer> kv: frequencyMap.entrySet()){
            List<String> groupedChar = group.getOrDefault(kv.getValue(), new ArrayList<String>());
            groupedChar.add(kv.getKey());
            group.put(kv.getValue(), groupedChar);
        }

        List<Integer> integers = new ArrayList<>(group.keySet());
        Collections.sort(integers, Collections.reverseOrder());

        StringBuilder builder = new StringBuilder();
        for (int i : integers){
            List<String> values = group.get(i);

            for (String c : values){
               builder.append(c.repeat(i));
            }
        }

        System.out.println(builder.toString());
    }
}
