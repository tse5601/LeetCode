/*
    
	ID：144
	标题：Binary Tree Preorder Traversal
	问题描述：
    Given a binary tree, return the preorder traversal of its nodes' values.

	For example:
	Given binary tree [1,null,2,3],
    
	解题思路：
    迭代。利用栈来保存遍历到的节点，应首先进行出栈抛出当前节点，保存当前节点的值，随后将右、左节点分别入栈，迭代到其为叶子节点(NULL)为止。

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;

        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while (!s.empty()) {
            TreeNode node = s.pop();
            result.add(node.val);
            if (node.right != null) s.push(node.right);
            if (node.left != null) s.push(node.left);
        }

        return result;
    }
}