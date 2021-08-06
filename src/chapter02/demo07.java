package chapter02;

public class demo07 {
    //逐个判断：
    //一般字符串匹配的时候，最简单的一种方式，就是子串从头开始和主串匹配。
    //如果匹配失败，子串再次从头开始，而主串从上次匹配的下一个字符开始
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0){
            return 0;
        }
        int i=0;
        int j=0;
        while (i<haystack.length() && j<needle.length()){
            if (haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else {
                i=i-j+1;
                j=0;
            }
            if (j==needle.length())
                return i-j;
        }

        return -1;
    }
}
