/*Given a singly linked list, determine if it is a palindrome.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head==null)
            return true;
        
        ListNode slowPtr = head, fastPtr = head;
        
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        
        if(fastPtr!=null)
            slowPtr = slowPtr.next;
        
        slowPtr = reverseLinkedList(slowPtr);
        
        while(slowPtr!=null && head!=null && head!=slowPtr){
            
            if(slowPtr.val!=head.val)
                return false;
            else{
                slowPtr = slowPtr.next;
                head = head.next;
            }
        }
        
        return true;
    }
    
    private ListNode reverseLinkedList(ListNode head1){
        
        ListNode prev = null, temp = null;
        
        while(head1!=null){
            temp = head1.next;
            head1.next = prev;
            prev = head1;
            head1 = temp;
        }
        
        return prev;
        
    }
}