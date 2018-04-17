/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
    	ListNode ptr = head;
    	// count the number of elements in the list
    	while(ptr != null) {
    		length++;
    		ptr = ptr.next;
    	}
		// node to be deleted is head
        if(length == n)
            return head.next;
    	ptr = head;
    	// set ptr to the node before the node to be deleted
    	for(int i = 0; i < length-n-1; i++) {
    		ptr = ptr.next;
    	}
    	// delete the node
    	ptr.next = ptr.next.next;
    	// return head of the list
        return head;
    }
}