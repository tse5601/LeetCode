/*
    
	ID：33
	标题：Search in Rotated Sorted Array
	问题描述：
	Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

	(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

	You are given a target value to search. If found in the array return its index, otherwise return -1.

	You may assume no duplicate exists in the array.
    
	解题思路：
    （1）如果target==A[mid]，那么m就是我们要的结果，直接返回；
    （2）如果A[mid]<A[r]，那么说明从m到r一定是有序的（没有受到rotate的影响），那么我们只需要判断target是不是在m到r之间，如果是则把左边缘移到m+1，否则就target在另一半，即把右边缘移到m-1。
    （3）如果A[mid]>=A[r]，那么说明从l到m一定是有序的，同样只需要判断target是否在这个范围内，相应的移动边缘即可。
根据以上方法，每次我们都可以切掉一半的数据，所以算法的时间复杂度是O(logn)，空间复杂度是O(1)。代码如下：

*/


public class Solution {

    public int search(int[] A, int target) {
        if (A == null || A.length == 0) return -1;

        int lb = 0, ub = A.length - 1;
        while (lb + 1 < ub) {
            int mid = lb + (ub - lb) / 2;
            if (A[mid] == target) return mid;

            if (A[mid] > A[lb]) {
                if (A[lb] <= target && target <= A[mid]) {
                    ub = mid;
                } else {
                    lb = mid;
                }
            } else {
                if (A[mid] <= target && target <= A[ub]) {
                    lb = mid;
                } else {
                    ub = mid;
                }
            }
        }

        if (A[lb] == target) {
            return lb;
        } else if (A[ub] == target) {
            return ub;
        }
        return -1;
    }
}