/*You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode summationHead = null, summationNode = null;
        int prevRemainder = 0;
        int sum = 0;
        
        while (l1!=null || l2!=null){
            
            if (l1!=null && l2!=null){
                sum = (prevRemainder + l1.val + l2.val)%10;
                prevRemainder = (prevRemainder + l1.val + l2.val)/10;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if (l1!=null && l2 == null){
                sum = (prevRemainder + l1.val)%10;
                prevRemainder = (prevRemainder + l1.val)/10; 
                l1 = l1.next;
            }
            else if (l1==null && l2 != null){
                sum = (prevRemainder + l2.val)%10;
                prevRemainder = (prevRemainder + l2.val)/10;
                l2 = l2.next;
            }
            
            if (summationHead==null){
                summationNode = new ListNode(sum);
                summationHead = summationNode;
            }
            else{
                summationNode.next = new ListNode(sum);
                summationNode = summationNode.next;
            }
        }
        
        if (prevRemainder>0){
            summationNode.next = new ListNode(prevRemainder);
        }
        
        return summationHead;
    }
}