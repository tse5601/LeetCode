/*
    
	ID：283
	标题：Move Zeroes
	问题描述：
    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
    
	解题思路：
	这道题最先想到的是使用遍历后重新插入新数组的方法。
	1.即先遍历整个数组nums的元素
	2.判断nums[i]当前的数字是否为0，如果不为0，那么我们就把整个数据保存在一个新的数组中，同时记录当前有1个元素被移动。
	3.然后我们通过第二步得到的n个元素被移动的值后，根据整个数组的长度来判断剩余存在0的个数，再在新数组末尾加上相应的个数即可。

*/

public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int insertPosition = 0;
        for(int num : nums){
            if(num != 0){
                nums[insertPosition++] = num;
            }
        }
        
        while(insertPosition < nums.length)
            nums[insertPosition++] = 0;
    }
}