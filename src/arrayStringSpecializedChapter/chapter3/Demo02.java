package arrayStringSpecializedChapter.chapter3;
//最长的回文子串
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
public class Demo02 {
    //暴力解法
    public String longestPalindrome1(String s) {
        int length = s.length();
        if(length < 2){
            return s;
        }
        // 暴力解法
        //max是记录最长的回文子串的长度
        int max = 1;
        //begin是记录回文子串开始的index
        int begin = 0;
        for(int i = 0; i < length - 1; i++){
            for(int j = i + 1; j < length; j++){
                //检测当前子字符串是否是回文子串且长度是否大于上一个回文子串
                if(valid(s, i, j) && (j - i + 1) > max){
                    max = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + max);
    }

    private boolean valid(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //中心扩展法
    //基本思路:
    //从某个元素开始,左右两边探索是否符合回文数并返回回文数的长度,比较并保存最长起始坐标和长度;
    //注意:回文数奇偶情况
    public String longestPalindrome2(String s){
        if (s == null || s.length() < 2) return s;
        int resIdx = 0, resLen = 1;
        for (int idx = 0; idx < s.length() - 1; idx++) {
            //奇数最长回文长度
            int len1 = longestLen(s, idx, idx);
            //偶数最长回文长度
            int len2 = longestLen(s, idx, idx + 1);
            if (len1 > resLen) {
                resLen = len1;
                //resIdx是回文串的begin index
                //idx是当前检查元素的index，resLen是找到的回文串的长度
                resIdx = idx - resLen / 2;
            }
            if (len2 > resLen) {
                resLen = len2;
                resIdx = idx - (resLen / 2 - 1);
            }
        }
        return s.substring(resIdx, resIdx + resLen);

    }
    //左右探索最长回文子串长度
    private int longestLen(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) break;
            left--;
            right++;
        }
        //返回此回文串的长度
        //不存在回文串时返回的是0
        return right - left - 1;
    }

}
