package chapter01;

import java.util.HashMap;
import java.util.Map;

public class demo09 {
    //最暴力解法
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if (sum==target){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    //用hashmap来解决
    public int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i])!=null){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
