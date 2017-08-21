/*
    
	ID：217
	标题：Contains Duplicate
	问题描述：
    Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least         twice in the array, and it should return false if every element is distinct.
    
	解题思路：
    使用HashSet没有重复元素的特性，来处理此方法。以得到时间复杂度为O（n）的解决方案

*/

class Solution {
public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}
}