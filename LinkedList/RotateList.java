/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
 * Logic:
 * 1. Runner technique:
 * you can use a two pointer technique where the 'fast' pointer is always k nodes ahead of 'slow'. 
 * By the time 'fast' reaches the last node, 'slow' must be pointing to the (k+1)th nodes from backwards, 
 * then you can simply detach slow->next from slow, then set fast->next to head, and you are done.
 * Time complexity - O(n), Space complexity - O(1)
 * 
 * 2. Linked List length and manage pointers
 * 
 * 3. three times reverse() like rotating array
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode fast = head;
        for(int i=0; i<k; i++){
            fast = fast.next;
            if(fast == null)
                fast = head;
        }
        ListNode slow = head;
        while(fast.next!=null){
            slow = slow .next;
            fast = fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}