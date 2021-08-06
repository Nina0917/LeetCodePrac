package chapter02;

import java.util.Arrays;

public class demo03 {
    //两次遍历
    //先统计每个字符出现的次数，再遍历s中的每个字符
    public int firstUniqChar(String s) {
        //一共26个英文字母
        int[] alphabetArr = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            //a->0, b->1, c->2 ..... z->25
            int letterIndex = chars[i] - 'a' -0;
            alphabetArr[letterIndex]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int letterIndex=chars[i]-'a'-0;
            if (alphabetArr[letterIndex]==1){
                return i;
            }
        }
        return -1;
    }

    //错误，如aabb
    /*public int firstUniqChar2(String s){
        for (int i = 0; i < s.length()-1; i++) {
            char charStr=s.charAt(i);
            int count=0;
            for(int j=i+1;j<s.length();j++){
                if (charStr==s.charAt(j))
                    count++;
            }
            if (count==0)
                return i;
        }
        return -1;
    }*/


}
