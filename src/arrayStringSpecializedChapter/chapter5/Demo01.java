package arrayStringSpecializedChapter.chapter5;

import java.util.Arrays;

//反转字符串中的单词 III
//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
public class Demo01 {
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            String reverse = reverseChars(chars);
            sb.append(reverse).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();


    }

    public static String reverseChars(char[] chars){
        int n=chars.length;
        for (int i=0;i<n/2;i++){
            char temp = chars[i];
            chars[i]=chars[n-i-1];
            chars[n-i-1]=temp;
        }
        return new String(chars);
    }



    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));


    }
}
