package com.cozzycoder.dataStructure.stack;

public class RmovingStars {

    public static void main(String[] args) {

        String str = "leet**cod*e";

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : str.toCharArray()){

            if(!stringBuilder.isEmpty() && c == '*'){
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                continue;
            }

            stringBuilder.append(c);
        }

        System.out.println(stringBuilder.toString());
    }
}
