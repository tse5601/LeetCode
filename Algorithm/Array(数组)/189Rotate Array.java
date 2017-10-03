/*
	ID：189
	标题：Rotate Array  
	问题描述：
	Rotate an array of n elements to the right by k steps.

        For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].   
    
	解题思路：
	笔记：假设按照题目中输入的数字：1,2,3,4,5,6,7 k=3
	那么按照此算法，通过取余数，就可以判定当前的位置。
	a[(i + k) % nums.length] = nums[i]：解析

	第一轮：a[3] = nums[0]
	第二轮：a[4] = nums[1]
	...
	最后一轮：a[2] = nums[6]
*/
class Solution {
  public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
  }
}
/*class Solution {

    public void rotate(int[] nums, int k) {
    	int[] A = new int[k];
        if(k>0){
        	if(nums.length > k) {
                for (int i = 0 ; i < k ; i++){
                    A[i] = nums[nums.length - k + i];
                }
                
                for(int j = 0 ; j < nums.length - k ; j++){
                    nums[nums.length - j -1] = nums[nums.length - k - 1];
                }
                
                for(int m = 0 ; m < k ; m++){
                    nums[m] = A[m];
                }
        	}
        }
    }
}*/