package arrayStringSpecializedChapter.chapter4;

import java.util.Arrays;

//移除元素
//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
public class Demo03 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int m=0,n=0;
        while (n<nums.length){
            if (nums[n]!=val){
                nums[m++]=nums[n];
                n++;
            }else {
                n++;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(m);
    }
}
