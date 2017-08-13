/*
	ID：566
	标题：Reshape the Matrix   
	问题描述：
	In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.
	You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
	The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
	If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
    
	解题思路：
    1.判断提供的r * c 是否等于整个数组中的个数。且判断提供的nums数组长度是否为0
    2.循环遍历：原始表里的每一个元素。即nums[0].length和nums.length
    3.先输出到行列中，当col和c相等的时候，就是一行内容的输出满。继续便利第二行，即row++，直至原始矩阵全部便利完毕输出。
*/
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int res[][] = new int[r][c];
        if(nums.length == 0 || r * c != nums.length * nums[0].length){
            return nums;
        }
        int row = 0 ;
        int col = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
            for(int j = 0 ; j < nums[0].length ; j++){
                res[row][col] = nums[i][j];
                col++;
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        return res;
    }
}
