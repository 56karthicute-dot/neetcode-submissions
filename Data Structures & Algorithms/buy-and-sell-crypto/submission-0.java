class Solution {
    public int maxProfit(int[] prices) {
        int entry = prices[0];
        int maxProfit = 0;
        for (int i=1;i<prices.length;i++) {
            if(entry>prices[i]) {
                entry = prices[i];
            }
            else {
                maxProfit = Math.max((prices[i] - entry), maxProfit);
            }
        }
        return maxProfit;
    }
}
