/*
	ID：280
	标题：Wiggle Sort   
	问题描述：
    Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

    For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
	
    解题思路：
    题目对摇摆排序的定义有两部分：

     如果i是奇数，nums[i] >= nums[i - 1]
     如果i是偶数，nums[i] <= nums[i - 1]
	 
	 判断奇数：i%2 == 1 判断偶数1%2 == 2
     所以我们只要遍历一遍数组，把不符合的情况交换一下就行了。如果nums[i] > nums[i - 1]， 则交换以后肯定有nums[i] <= nums[i - 1]。
*/
public class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            // 需要交换的情况：奇数时nums[i] < nums[i - 1]或偶数时nums[i] > nums[i - 1]
            if((i % 2 == 1 && nums[i] < nums[i-1]) || (i % 2 == 0 && nums[i] > nums[i-1])){
                int tmp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
