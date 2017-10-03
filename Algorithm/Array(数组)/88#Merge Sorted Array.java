/*
	ID：88
	标题：Merge Sorted Array  
	问题描述：
	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
    

*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;//数组A的最后一个坐标
        int j = n - 1;//数组B的最后一个坐标
        int k = m + n - 1;//两个数组的长度
        while (i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums2[i];
                k--;
                i--;
                
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while(j>=0)
            nums1[k--] = nums2[j--];
    }
}