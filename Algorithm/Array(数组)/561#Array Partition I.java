/*
  ID:561
  标题:Array Partition I
  问题描述:Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
  解题思路：1.由于题目给出的数量为2n，所以只考虑偶数的情况。即长度为：nums.length
            2.题目要求每一组的数据的最小数相加后，结果尽可能的保持最大。那么其实就是告诉我们要先进行正序排序，这样相加出来的结果才会尽可能的大。
			3.理清楚思路后，我们实现代码，即先排序，后相加首个数字即可。
*/
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0 ;
        for(int i = 0 ; i < nums.length; i = i + 2){
            result = nums[i] + result ;
        }
        return result;
    }
}