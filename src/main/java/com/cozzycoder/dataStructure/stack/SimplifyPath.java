package com.cozzycoder.dataStructure.stack;

import java.util.Queue;
import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {

        String path = "/home/";
        String [] pathArray  = path.split("/");
        Stack<String> stringBuilder = new Stack<String>();
        for (String str : pathArray){

            if(str.equals("..")) {
                stringBuilder.pop();
            } else if(!str.equals(".") && !str.equals("")){
                stringBuilder.push(str);
            }
        }

        StringBuilder stringBuilder1 = new StringBuilder();
        for (String str : stringBuilder) {
            stringBuilder1.append("/" + str);
        }

        System.out.println(stringBuilder1.toString());
    }
}
