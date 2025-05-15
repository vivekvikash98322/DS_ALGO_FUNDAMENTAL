package com.cozzycoder.revision.dataStructure.slidingWindow;

public class MaxVowelSubSTRING {

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }


    public static int maxVowels(String s, int k) {

        int vowelCount = 0;
        int maxVowel = 0;
        boolean [] map = new boolean[26];
        map[0] = true;
        map['e' - 'a'] = true;
        map['i' - 'a'] = true;
        map['o' - 'a'] = true;
        map['u' - 'a'] = true;

        for(int i = 0; i < k; i++){
            if(map[s.charAt(i) - 'a']){
                vowelCount++;
            }
        }

        maxVowel= vowelCount;

        for(int i = k; i < s.length(); i++){
            if(map[s.charAt(i) - 'a']){
                vowelCount++;
            }

            if(map[s.charAt(i - k) - 'a']){
                vowelCount--;
            }

            maxVowel = Math.max(maxVowel, vowelCount);
        }

        return maxVowel;
    }
}
