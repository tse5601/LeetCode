/*
	ID：66
	标题：Plus One   
	问题描述：
	Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

    You may assume the integer do not contain any leading zero, except the number 0 itself.

    The digits are stored such that the most significant digit is at the head of the list.
    
	解题思路：
    此题为Google面试的经典原题，为什么说是经典题呢。以我的看法是由于要考虑多种相加的情况。
    举例：{1,1,1} {9,9,9} {1,1,9}
    对于第一种情况，如果数组最后一位小于9，那么相加后直接return返回。
    对于第三种情况，如果最后一位是9，那么将改为置位0后，下一位相加return返回。
    如果下一位还是为9，就是我列出的第二种情况。全都是为9，那么在for循环遍历完成后，new出一个新数组，返回该数组。
*/

class Solution {
	public int[] plusOne(int[] digits) {
       
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;
	}
}