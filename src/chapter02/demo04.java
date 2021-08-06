package chapter02;

import java.util.Arrays;

public class demo04 {
    //字母异位词：单词中是否只有字母的位置不同
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);


        if (sChar.length != tChar.length){
            return false;
        }
        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] != tChar[i]){
                return false;
            }
        }
        return true;
    }
}
