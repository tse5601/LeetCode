/*
	ID：245
	标题：Shortest Word Distance III   
	问题描述：
     This is a follow up of Shortest Word Distance. The only difference is now word1 could be the same as word2.

     Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

     word1 and word2 may be the same and they represent two individual words in the list.

     For example,
     Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

     Given word1 = “makes”, word2 = “coding”, return 1.
     Given word1 = "makes", word2 = "makes", return 3.
    
	解题思路：
	用双指针，初始化为-1，找到word1，赋值point1，找到word2，赋值point2，如果两个相等，在point1的处理函数里进行距离比较，如果不等，在两个word都判断完之后比较。
*/
public class Solution {
	public static int shortestWordDistance(String[] words, String word1, String word2) {  
		int point1 = -1;
		int point2 = -1;
		int max = Integer.MAX_VALUE;
		for(int i = 0 ; i < words.length ; i++) {
			if(word1.equals(words[i])) {
				//特殊情况：如果word1和word2相等
				if(point1 != -1 && word1.equals(word2)) {
					max = Math.min(max, Math.abs(i - point1));
				}
				//如果第一个数，匹配到了数组中的数据，那么就把指针指向这个数字 
				point1 = i;
				
			}else if(word2.equals(words[i])) {
				//如果words2匹配到了数组中的数据，那么就把第二个指针指向这个数字
				point2 = i;
			}
			//有了前面的指针1和指针2，现在通过Math.min来计算最小的值
			
			if(point1 != -1 && point2 != -1) {
				max = Math.min(max, Math.abs(point2 - point1));
			}
		}
        return max;
    }
}
