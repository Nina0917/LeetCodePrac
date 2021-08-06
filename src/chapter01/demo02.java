package chapter01;

public class demo02 {
    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int total = 0, index = 0, length = prices.length;
        while (index < length) {
            //如果股票下跌就一直找
            while (index < length - 1 && prices[index] >= prices[index + 1]) {
                index++;
            }
            //股票上涨开始的值，也是这段时间上涨的最小值
            int min = prices[index];
            //一直找到股票上涨的最大值为止
            while (index < length - 1 && prices[index] <= prices[index + 1]) {
                index++;
            }
            //计算这段时间的差值，然后累计
            total += prices[index++] - min;

        }

        return total;
    }
}
