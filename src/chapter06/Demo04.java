package chapter06;

public class Demo04 {
    public int rob(int[] nums) {
        //边界条件判断
        if (nums == null || nums.length == 0)
            return 0;
        int length = nums.length;
        int[][] dp=new int[length][2];
        //第一家没偷
        dp[0][0]=0;
        //第一家偷了
        dp[0][1]=nums[0];
        //从第二家，及i=1的时候开始判断
        for (int i=1;i<length;i++) {
            //第i+1家没有偷的最大金钱数，取上一家偷了和上一家
            //没偷的两种情况的最大值就行
            dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]);

            //第i+1家偷了的最大金钱数，此时上一家不能偷
            //取上一家没偷的金钱数加上这一家偷了的金钱数
            dp[i][1]=dp[i-1][0]+nums[i];

        }
        return Math.max(dp[length-1][0],dp[length-1][1]);
    }
}
