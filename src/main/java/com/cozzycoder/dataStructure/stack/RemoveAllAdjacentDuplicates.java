package com.cozzycoder.dataStructure.stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

    public static void main(String[] args) {
        String str  = "abbaca";

        Stack<Character> characterStack = new Stack<>();

        for (char c : str.toCharArray()){

            if(!characterStack.isEmpty() && characterStack.peek() == c) {
                characterStack.pop();
                continue;
            }

            characterStack.push(c);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : characterStack){
            stringBuilder.append(c);
        }

        System.out.println(stringBuilder.toString());
    }
}
