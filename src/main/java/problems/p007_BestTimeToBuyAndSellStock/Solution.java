package problems.p007_BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
//        //brute-force approach: time limit exceeded
//        int profit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                profit = Math.max(profit, prices[j] - prices[i]);
//            }
//        }
//        return profit;
        int lowestPrice = prices[0];
        int profit = 0;
        for (int price: prices) {
            lowestPrice = Math.min(lowestPrice, price);
            profit = Math.max(profit, price - lowestPrice);
        }
        return profit;
    }
}
