Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Follow up:
What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?
		
/*
 * Logic:
 * 1. Get Linked list's size.
 * 2. Random.nextInt(size) .. output will be 0 to size (o inclusive and size exclusive)
 * 3. Print random node according to nextInt's output
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
    private int length = 0;
    private ListNode curr;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.curr = head;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
        curr = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        Random r = new Random();
        int val = r.nextInt(length);
        while(val > 0){
            curr = curr.next;
            val--;
        }
        return curr.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */