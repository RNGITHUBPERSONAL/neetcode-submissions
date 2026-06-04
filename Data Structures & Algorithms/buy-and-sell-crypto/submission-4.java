class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int val = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (min >= prices[i]) {
                min = prices[i];
            } else {
                val = prices[i] - min;

                if (max < val) {
                    max = val;
                }
            }
        }
        return max;
    }
}
//if else condition  menat for presnt and next day so you bouht if day and ned to sell else day 