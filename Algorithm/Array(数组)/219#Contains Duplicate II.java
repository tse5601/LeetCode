/**
	ID：219
	标题：Contains Duplicate II 
	问题描述：
	Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

    思路：假设数据为：1,2,3,1,4 然后k = 1
    第一轮：1
    第二轮：1,2
    第三轮：2,3

    所以就是if(i > k) set.remove(nums[i-k-1]);设计的目的。因为k为1，所以数组中只能有两个数据，这样才能保证k=1的情况下，保证数据两边判断是否相同才有效。
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i < nums.length; i++){
                if(i > k) set.remove(nums[i-k-1]);
                if(!set.add(nums[i])) return true;
            }
            return false;
     }
}

/*class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0)
            return false;
        for (int i = 0 ; i < nums.length ; i++){
            for (int j = i + 1 ; j < nums.length ; j++){
                if (nums[i] == nums[j] &&  abs(i-j) <= k){
                    return true;                    
                }
            }
        }  
    }
}*/