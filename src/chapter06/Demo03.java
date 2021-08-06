package chapter06;

public class Demo03 {
    public int maxSubArray(int[] num){
        int length=num.length;
        int[] dp=new int[length];
        //边界条件
        dp[0]=num[0];
        int max=dp[0];
        for (int i=1;i<length;i++){
            //转移公式
            dp[i]=Math.max(dp[i-1],0)+num[i];
            //记录最大值
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
