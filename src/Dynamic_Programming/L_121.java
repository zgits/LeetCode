package Dynamic_Programming;

/**
 * @Description: 121. 买卖股票的最佳时机
 * @Author: 幻夜~星辰
 * @Date: Created in 2019/3/21 17:35.
 */
public class L_121 {
    public int maxProfit(int[] prices) {

        if(prices.length==0){
            return 0;
        }
        int buy=prices[0];
        int result=0;
        for (int i = 0; i < prices.length; i++) {
            buy=Math.min(buy,prices[i]);
            result=Math.max(result,prices[i]-buy);
        }


        return result;
    }
}
