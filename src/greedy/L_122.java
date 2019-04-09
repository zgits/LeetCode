package greedy;
//贪心算法
/**
 * @Author: zjf
 * @Date: 2019/4/9 14:35
 * @Description: 122. 买卖股票的最佳时机 II
 */
public class L_122 {
    public int maxProfit(int[] prices) {

        /**
         * 贪心算法，只要明天比今天的大，我就买今天的，明天卖出去
         */
        int result=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                result+=prices[i]-prices[i-1];
            }
        }


        return result;

    }
}
