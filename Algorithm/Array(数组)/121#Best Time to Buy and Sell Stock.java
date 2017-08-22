/*
    
	ID：121
	标题：Best Time to Buy and Sell Stock
	问题描述：
    If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
    
	解题思路：
    使用动态规划的思想，假设在第i天买入，什么时候能赚到的最多的钱呢？
    即从第i+1天到n天中选择最大的数字，减去第i天的数字。
    本问题关键在于，先获取最小的数，然后根据最小的数和第二个数的差值比较，大于maxprofit的话就赋值。最后return
      ...

*/

public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}