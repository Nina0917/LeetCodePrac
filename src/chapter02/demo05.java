package chapter02;

public class demo05 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            //根据题目要求，只考虑字母和数字，不考虑空格和逗号
            //不可以用if，万一两个空格/逗号连在一起呢
            //必须加上left<right这个判断条件，比如测试用例为",."时，没有的话就 indexOutOfBound
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
