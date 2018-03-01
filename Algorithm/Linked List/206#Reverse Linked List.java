/*
    
	ID：206
	标题：Reverse Linked List
	问题描述：
    Reverse a singly linked list.

	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
    
	解题思路：
	temp = head->next;
	head->next = prev;
	prev = head;
	head = temp;
	保存head下一节点
    将head所指向的下一节点改为prev
    将prev替换为head
    将第一步保存的下一节点替换为head，用于下一次循环
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        // fix head
        head = prev;

        return head;
    }
}