package arrayStringSpecializedChapter.chapter4;

import java.util.Arrays;

/*
两数之和 II - 输入有序数组
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;

        int m=0, n=numbers.length-1;
        while (m<n){
            if (numbers[m] + numbers[n]<target) {
                m++;
            }else if (numbers[m] + numbers[n]>target){
                n--;
            }else {
                break;
            }
        }
        m++;n++;
        int[] index={m,n};
        System.out.println(Arrays.toString(index));
    }
}
