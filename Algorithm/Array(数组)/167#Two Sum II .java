/*
    
	ID：167
	标题：Two Sum II - Input array is sorted
	问题描述：
	Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
    
	解题思路：
	1.使用HashMap，遍历存入所有的元素<值，位置>
	2.遍历整个数组，target-目标元素，判断是否存在于Map中，如果存在输出两个数字的位置。如果不存在抛出异常。

*/

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < numbers.length ; i++){
            map.put(numbers[i],i);
        }
        for(int j = 0 ; j < numbers.length ; j++){
            int complement = target - numbers[j];
            //如果相减的值存在，且他自己本身不为0。那么就output出这两个值
            if(map.containsKey(complement) && map.get(complement) != j){
                return new int[]{j+1,map.get(complement)+1};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}