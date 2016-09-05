/*Given a linked list, remove the nth node from the end of list and return its head.

For example,

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:
Given n will always be valid.
Try to do this in one pass.*/

/*
 * Logic:
 * 
 * This is runner technique.
 * Have slow and fast ptrs.
 * Move fast ptr by n positions.
 * Then move noth slow and fast till fast reaches null. Then delete the target node.
 * special case below: if (prev==null) i.e. head is to be deleted from Linkedlist
 * 
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0; i<n; i++)
            fast = fast.next;
        
        ListNode prev = null;    
        while(fast!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(prev==null)
            head = slow.next;
        else
            prev.next = slow.next;
        return head;
    }
}