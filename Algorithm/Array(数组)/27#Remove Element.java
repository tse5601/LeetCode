/*
	ID：27
	标题：Remove Element   
	问题描述：
	Given input array nums = [3,2,2,3], val = 3

	Your function should return length = 2, with the first two elements of nums being 2.
    
        解题思路：
    
*/
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}