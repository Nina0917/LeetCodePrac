package arrayStringSpecializedChapter.chapter4;
//长度最小的子数组
//给定一个含有 n 个正整数的数组和一个正整数 target 。
public class Demo05 {

    //暴力求解法
    public static int minSubArrayLen1(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                System.out.println("sum: "+sum);
                if (sum >= target) {
                    System.out.println("j: "+j);
                    System.out.println("i: "+i);
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    //滑动窗口
    public static int minSubArrayLen2(int target, int[] nums){
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            System.out.println("sum: "+sum);
            while (sum >= target) {

                System.out.println("start: "+start);
                System.out.println("end: "+end);

                //ans用来记录连续数组的长度
                ans = Math.min(ans, end - start + 1);

                System.out.println("ans: "+ans);

                //每一轮while loop，将nums[start]减去，并将start右移直到sum<target
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }

    public static void main(String[] args) {
        int target1 = 7; int[] nums1 = {2,3,1,2,4,3};
        int target2 = 4; int[] nums2 = {1,4,4};
        //minSubArrayLen1(target1,nums1);

        minSubArrayLen2(target1,nums1);
    }
}
