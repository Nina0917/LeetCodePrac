package QueueStackChapter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//219. 存在重复元素 II
//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的
// 绝对值 至多为 k。
//

public class Demo03 {

    public static boolean containsNearbyDuplicate(int[] nums, int k){
        int len=nums.length;
        //i是滑动窗口的末尾
        //j是滑动窗口的开头
        //当i小于等于k时，j都是零，当i大于k时，窗口的起点不再是index为0的元素，而是index为i-k的元素
        for (int i=1;i<len;i++){
            for (int j=Math.max(0,i-k);j<i;j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums2 = {1,2,3,4,5,6};
        containsNearbyDuplicate(nums2,3);
    }
}
