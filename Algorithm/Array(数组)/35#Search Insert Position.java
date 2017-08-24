/*
    
	ID：35
	标题：Search Insert Position
	问题描述：
    Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    
	解题思路：
    使用二分查找思路解决

*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        private int low = 0;
        private int high = nums.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(nums(mid) == target)
                return mid;
            else if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}