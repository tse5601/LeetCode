/*
    
	ID：268
	标题：Missing Number
	问题描述：
    Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
    
	解题思路：
    使用XOR，异或运算来处理。假设数组是连续性的，那么数组的长度^i的值，应该与数组的长度^nums[i]的值相等。
    如果不相等，那么后续就会排查出此数据

*/

class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
	    for(int i=0; i<nums.length; i++){
	        res ^= i;
	        res ^= nums[i];
	    }
	    return res;
    }
}