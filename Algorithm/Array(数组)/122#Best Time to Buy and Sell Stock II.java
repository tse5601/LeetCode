/*
    
	ID：122
	标题：Best Time to Buy and Sell Stock II
	问题描述：
	Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the     stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy     again).
    
	解题思路：
    贪心法
    从前向后遍历数组，只要当天的价格高于前一天的价格，就算入收益。

*/
public class Solution {
public int maxProfit(int[] prices) {
    int total = 0;
    for (int i=0; i< prices.length-1; i++) {
        if (prices[i+1]>prices[i]) 
            total += prices[i+1]-prices[i];
    }
    return total;
    }
}