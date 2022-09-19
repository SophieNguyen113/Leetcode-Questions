class Solution {
    public int maxProfit(int[] prices) {
        int min= Integer.MAX_VALUE;
        int max_profit = 0, profit_so_far =0;
        for(int price:prices){
            if(price<min){
                min = price;
            }
            profit_so_far = price - min;
            if(profit_so_far>max_profit){
                max_profit = profit_so_far;
            }
            
        }
        return max_profit;
    }
}