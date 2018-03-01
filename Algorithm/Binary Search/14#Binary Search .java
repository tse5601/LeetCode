/*
    
	ID：14
	标题：Binary Search 
	问题描述：
     For a given sorted array (ascending order) and a target number, find thefirst index of this number in O(log n) time complexity.
     If the target number does not exist in the array, return -1.
    
	解题思路：
    对于已排序升序(升序)数组，使用二分查找可满足复杂度要求

*/


class Solution {
    public int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = -1, end = nums.length;
        int mid;
        while (start + 1 < end) {
 
            mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (end == nums.length || nums[end] != target) {
            return -1;
        } else {
            return end;
        }
    }
}