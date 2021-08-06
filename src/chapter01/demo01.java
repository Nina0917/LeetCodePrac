package chapter01;

public class demo01 {
    /*给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。

    不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

    */
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        System.out.println(removeDuplicates(nums));


    }

    public static int removeDuplicates(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int m = 0;
        int n = 1;
         while (n < nums.length){
             if (nums[m] != nums[n]){
                 m++;
                 nums[m]=nums[n];
             }
             n++;
         }
         return m+1;
    }
}
