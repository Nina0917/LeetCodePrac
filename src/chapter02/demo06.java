package chapter02;

import java.util.Arrays;

public class demo06 {
    public static int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int length=chars.length;
        int index=0;
        //先去除空格
        while (index<length && chars[index]==' '){
            index++;
        }

        //极端情况“ ”和“”
        if(index>=length)
            return 0;

        //判断符号
        int sign=1;
        if(chars[index] == '-' || chars[index] == '+'){
            if(chars[index] == '-'){
                sign = -1;
            }
            index++;
        }


        int result=0;
        int temp=0;
        while (index<length){
            int num = chars[index]-'0';
            //说明读取的char不在0-9的编码范围之内
            if (num>9 || num<0)
                break;
            temp=result;
            result=result*10+num;
            //不可以写成(result-num)/10!=temp
            //因为2147483640+8 = -2147483648
            //（-2147483648-num）/ 10 == 214748364==temp ,程序会走到最后，即 result*sign
            if (result/10!=temp){
                if (sign>0){
                    System.out.println(sign);
                    return Integer.MAX_VALUE;
                }else {
                    System.out.println(sign);
                    return Integer.MIN_VALUE;
                }
            }

            index++;
        }
        System.out.println("zoudao");
        System.out.println(sign);
        return result*sign;


    }

    public static void main(String[] args) {
        /*int i = demo06.myAtoi("2147483648");
        System.out.println(i);*/

        //System.out.println('3'-'0');
        int limit=2147483640 + 8;
        System.out.println(limit-8);

    }
}
