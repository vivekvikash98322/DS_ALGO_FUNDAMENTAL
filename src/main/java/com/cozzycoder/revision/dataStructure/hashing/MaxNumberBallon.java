package com.cozzycoder.revision.dataStructure.hashing;

public class MaxNumberBallon {

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }

    public static int maxNumberOfBalloons(String text) {

        int number = Integer.MAX_VALUE;

        int [] actaulBallon = new int[26];
        int [] map = new int[26];
        String str = "balloon";
        int stringLength = str.length();
        int length = text.length();

        for(int i = 0; i < stringLength; i++){
            actaulBallon[str.charAt(i) - 'a']++;
        }

        for(int i = 0; i < length; i++){
            map[text.charAt(i) - 'a']++;
        }

        int acLength = actaulBallon.length;
        for (int i = 0; i <acLength; i++) {

            if(actaulBallon[i] == 0) continue;

            if(actaulBallon[i] > map[i]) {
                return 0;
            }

            number = Math.min(number,  map[i] / actaulBallon[i]);
        }

        return number;
    }
}
