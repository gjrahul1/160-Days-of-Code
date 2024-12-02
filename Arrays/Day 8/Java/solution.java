class Solution {
    public int maximumProfit(int prices[]) {
        
        int max_profit = 0;
        int price = 0;
        int profit = 0;
        int min_price = prices[0];
        
        for(int i = 0; i<prices.length; i++) {
            price = prices[i];
            min_price = Math.min(min_price,price);
            profit = price - min_price;
            max_profit = Math.max(profit,max_profit);
        }
        
        return max_profit;
       
    }
}
