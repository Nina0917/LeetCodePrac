package chapter06;

public class Demo01 {
    //递归，当n稍微大一点就算不出来了，效率比较差
    public static int climbStairs(int n){
        if (n==1)
            return 1;
        if (n<3)
            return n;
        return climbStairs(n-1)+climbStairs(n-2);
    }

    //非递归优化
    public int climbStairs2(int n){
        if (n <= 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
