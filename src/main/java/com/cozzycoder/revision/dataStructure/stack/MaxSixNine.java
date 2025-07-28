package com.cozzycoder.revision.dataStructure.stack;

public class MaxSixNine {

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }

    public static int maximum69Number (int num) {

        String s = Integer.toString(num);
        StringBuilder stringBuilder = new StringBuilder();
        int length = s.length();
        int converted  = 0;

        for (int i = 0; i < length; i++) {

            if(converted == 0 && s.charAt(i) == '6') {
                stringBuilder.append("9");
                converted = 1;
                continue;
            }

            stringBuilder.append(s.charAt(i));

        }


        return Integer.parseInt(stringBuilder.toString());
    }
}
