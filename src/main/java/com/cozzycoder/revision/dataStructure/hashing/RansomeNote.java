package com.cozzycoder.revision.dataStructure.hashing;

public class RansomeNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa"));
        System.out.println(canConstruct_1("a", "b"));
        System.out.println(Character.isLowerCase('a'));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        int [] charCountMap = new int [26];

        int ranStart = 0;
        int magStart = 0;
        StringBuilder stringBuilder = new StringBuilder();
        int ranLength = ransomNote.length();
        int magLenth = magazine.length();
        while(ranStart < ranLength && magStart < magLenth ){

            if(ransomNote.charAt(ranStart) == magazine.charAt(magStart) || charCountMap[ransomNote.charAt(ranStart) - 'a'] > 0) {
                stringBuilder.append(ransomNote.charAt(ranStart));
                ranStart++;
                magStart++;
                continue;
            }

            charCountMap[magazine.charAt(magStart) - 'a']++;
            magStart++;
        }

        while(ranStart < ranLength){

            if(charCountMap[ransomNote.charAt(ranStart) - 'a'] > 0) {
                stringBuilder.append(ransomNote.charAt(ranStart));
            }

            ranStart++;
        }

        return stringBuilder.toString().equals(ransomNote);

    }

    public static boolean canConstruct_1(String ransomNote, String magazine) {

        int [] charCountMap = new int [26];
        int start = 0;
        int end = magazine.length() - 1;

        while(start <= end){
            if(start == end) {
                charCountMap[magazine.charAt(start) - 'a']++;
                start++;
                continue;
            }
            charCountMap[magazine.charAt(start) - 'a']++;
            charCountMap[magazine.charAt(end) - 'a']++;
            start++;
            end--;
        }


        for (int i = 0; i < ransomNote.length(); i++) {

            if(charCountMap[ransomNote.charAt(i) - 'a'] <= 0) {
                return false;
            }

            charCountMap[ransomNote.charAt(i) - 'a']--;
        }

        return true;

    }
}
