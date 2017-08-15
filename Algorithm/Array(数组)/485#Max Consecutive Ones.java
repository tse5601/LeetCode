/*
	ID：485
	标题：Max Consecutive Ones
	问题描述：
	Given a binary array, find the maximum number of consecutive 1s in this array.
    
	解题思路：
    1.便利整个长度的数组
    2.声明一个变量count用于统计连续出现字符的次数，声明变量result用于比较历史数据和count的值，返回最大的值即可。
    3.因为只统计连续出现的1。所以我们可以使用Math.max方法。当nums[i]为1的时候，count值加1，表示连续数字当前为1。
      将出现1状态的值保存并与result比较。这样便利一遍后，返回的result即为连续出现1的最大值了。
*/
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
        	count++;
        	result = Math.max(count, result);//核心：使用Math.max方法，用来保存最大的数字
            }
            else count = 0;
        }
        
        return result;
    }
}