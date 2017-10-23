/*
	ID：287. 
	标题：Find the Duplicate Number 
	问题描述：
    Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), 
	prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
    

*/
class Solution {
	public int findDuplicate(int[] nums) {
	
		if (nums.length > 1)
		{
			int slow = nums[0];
			int fast = nums[nums[0]];
			while (slow != fast)
			{
				slow = nums[slow];
				fast = nums[nums[fast]];
			}

			fast = 0;
			while (fast != slow)
			{
				fast = nums[fast];
				slow = nums[slow];
			}
			return slow;
		}
		return -1;
	}
}