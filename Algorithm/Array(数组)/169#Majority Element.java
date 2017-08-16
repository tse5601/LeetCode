/*
    
	ID：169
	标题：Majority Element
	问题描述：
    给定size 为n的数组，查找出主元素，就是出现次数大于n/2次的元素。你可以假定数组非空，而且主元素一定存在。
    
	解题思路：
    1.通过HashMap进行数组的全遍历。
    2.然后通过K，取出V的值。对于重复出现的值进行+1，再进行put，这样就可以更新数据.
    注意：在HashMap进行get操作的时候，如果取不到数据，那么对象会抛出null pointer exception。所以最好做一次判断：
    Boolean b = myMap.get(c);
    if(b != null && b)
      ...

*/

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int key = 0;
        int value = 0;
        int result = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if (map.containsKey(nums[i])){
                value = map.get(nums[i]) + 1;
                map.put(nums[i],value);
            }else{
                map.put(nums[i],1);
            }
        }
        //判断是否次数大于n/2
        for(int j = 0 ; j < nums.length ; j++){
            result = map.get(nums[j]);
            if(result > nums.length/2)
                return nums[j];
        }
        return -1;
    }
}