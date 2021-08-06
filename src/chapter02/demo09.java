package chapter02;

public class demo09 {
    public String longestCommonPrefix(String[] strs) {
        //边界条件判断
        if (strs == null || strs.length == 0)
            return "";
        //默认第一个字符串是他们的公共前缀
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            //不断的截取
            //不能写等等-1，比如["c","acc","ccc"]
            //不是验证pre存不存在，而是验证它是不是从头开始
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
            i++;
        }
        return pre;
    }



    public static void main(String[] args) {
        //System.out.println("flow".indexOf("flow"));
        System.out.println("f".substring(0,0));
        System.out.println("c".indexOf(""));
    }
}
