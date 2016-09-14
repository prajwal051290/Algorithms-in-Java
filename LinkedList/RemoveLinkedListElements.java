/*Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5*/

/*
 * Logic: Track prev pointers to maintain the linked list.
 * Also, create one dummy node which will point to head node of original linked list so that we can track prev
 * pointer throughout the linkedlist
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        
        while(curr!=null){
            if(head.val == val){
                prev = head;
                head = head.next;
                curr = curr.next;
                continue;
            }
            if (curr.val == val){
                prev.next = curr.next;
                curr = prev.next;
                continue;
            }
            curr = curr.next;
            prev = prev.next;
        }
        return head;
    }
}