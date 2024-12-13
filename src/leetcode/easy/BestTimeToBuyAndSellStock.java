package leetcode.easy;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }

        int minBuyPrice = prices[0];

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minBuyPrice) {
                minBuyPrice = prices[i];
            }

            if ((prices[i] - minBuyPrice) > maxProfit) {
                maxProfit = prices[i] - minBuyPrice;
            }

        }

        return maxProfit;

    }

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock bts = new BestTimeToBuyAndSellStock();

        int[] prices0 = {7, 1, 5, 3, 6, 4};
        int[] prices1 = {7, 6, 4, 3, 1};
        int[] prices2 = {2, 4, 1};

        System.out.println(bts.maxProfit(prices0));
        System.out.println(bts.maxProfit(prices1));
        System.out.println(bts.maxProfit(prices2));

    }

}
