/*Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null)
            return l2;
        else if (l2==null)
            return l1;
        
        ListNode mergeHead = null;
        ListNode mergeCurr = null;
        
        while(l1!=null && l2!=null){
            
            if(l1.val<=l2.val){
                if(mergeCurr==null){
                    mergeCurr = l1;
                    mergeHead = mergeCurr;
                }
                else{
                    mergeCurr.next = l1;
                    mergeCurr = mergeCurr.next;
                }
                l1=l1.next;
            }
            else{
                if(mergeCurr==null){
                    mergeCurr = l2;
                    mergeHead = mergeCurr;
                }
                else{
                    mergeCurr.next = l2;
                    mergeCurr = mergeCurr.next;
                }
                l2=l2.next;
            }
            
        }
        
        if(l1==null)
            mergeCurr.next = l2;
        else
           mergeCurr.next = l1;
           
        return mergeHead;
    }
}