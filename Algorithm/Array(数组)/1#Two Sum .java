/*
    
	ID：1
	标题：Two Sum  
	问题描述：
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
    
	解题思路：
	使用第一种for循环遍历，就是使用冒泡排序法，将整个数据元素一起遍历一遍，得出相应的结果。但是时间复杂度并不是最优方案。
	第二种使用HashMap的方式，我们可以利用<K,V>这个数据保存形式，使用相减的方式，我们可以寻找出另一个数字是否存在Map里，
	这样我们的时间的复杂度就是为O(n)，大大提高了我们运算时间。

*/


public class Solution {
    private int i ;
    private int j ;
    private int[] a = null;
	//twoSum1(nums,target)
	twoSum2(nums,target);
}

//Solution1:使用for循环遍历，时间复杂度为O(n^2)
public int[] twoSum1(int[] nums, int target) {
	for(i=0;i<nums.length;i++){
		for(j=i+1;j<nums.length;j++){
			if(target == nums[i] + nums[j]){
				a = new int[2];
				a[0] = i;
				a[1] = j;
				return a;
			}
		}
	}
	return a;
}


//Solution2:使用HashMap，时间复杂度为O(n)
public int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
