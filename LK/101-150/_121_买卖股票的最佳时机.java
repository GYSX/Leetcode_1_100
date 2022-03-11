import java.util.Map;

public class _121_买卖股票的最佳时机 {
    public static void main(String[] args) {
        int[] prices = new int[]{
                7,1,5,3,6,4

        };
        System.out.println("结果：" + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        if (length<2){
            return 0;
        }
        int buy = Integer.MAX_VALUE;
        int profit=0;
        if (length==2){
            if (prices[1] - prices[0]>=0) {
                return prices[1] - prices[0];
            }else {
                return 0;
            }
        }
        for (int i = 1; i < length; i++) {
            if (prices[i]<prices[buy]){
                buy=i;
            }else if (prices[i]-buy>profit){
                profit=prices[i]-buy;
            }
        }
            return  profit;
    }
}
