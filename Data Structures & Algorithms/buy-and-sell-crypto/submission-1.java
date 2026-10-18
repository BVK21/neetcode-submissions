class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int left = 0;       // Buy day
        int right = 1;      // Sell day
        int maxProfit = 0;

        while (right < prices.length) {

            if (prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];

                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Found a cheaper buying price
                left = right;
            }

            right++;
        }

        return maxProfit;
    }
}