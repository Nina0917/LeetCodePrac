package chapter06;

public class Demo02 {
    //双指针
    public int maxProfit(int[] prices){
        if (prices.length==0 || prices==null)
            return 0;
        int maxPro=0;
        int min=prices[0];
        for (int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            maxPro=Math.max(prices[i]-min,maxPro);
        }
        return maxPro;
    }
}
