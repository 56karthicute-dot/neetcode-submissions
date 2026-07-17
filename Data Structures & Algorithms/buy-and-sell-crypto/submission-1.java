class Solution {
    public int maxProfit(int[] prices) {
        int entry = prices[0];
        int maxProfit = 0;
        for (int price:prices) {
            maxProfit = Math.max((price - entry), maxProfit);
            entry = Math.min(entry,price);
        }
        return maxProfit;
    }
}
