package com.cozzycoder.revision.dataStructure.stack;

public class MakeStringGreat {

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }

    public static String makeGood(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {


            if(!stringBuilder.isEmpty()) {
                char lastStackEle = stringBuilder.charAt(stringBuilder.length() - 1);

                if((lastStackEle + 32) == s.charAt(i) || (lastStackEle == (s.charAt(i) + 32))){
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    continue;
                }
            }


            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }
}
