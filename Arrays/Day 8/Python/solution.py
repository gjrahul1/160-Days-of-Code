class Solution(object):
    def maxProfit(self, prices):
        min_price = prices[0]
        max_profit = 0

        for price in prices:
            min_price = min(price,min_price)
            profit = price - min_price
            max_profit = max(max_profit,profit)

        return mmax_profit
