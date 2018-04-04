class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null)
    		if(l2 == null)
    			return null;
    		else 
    			return l2;
    	else if(l2 == null)
    		return l1;
    	
    	ListNode result = null, tail = null;
    	
        while(l1 != null && l2 != null) {
        	if(l1.val <= l2.val) {
        		if(result == null) {
        			result = l1;
        			tail = result;
        		}
        		else {
        			tail.next = l1;
        			tail = tail.next;
        		}
        		l1 = l1.next;
        	}
        	else {
        		if(result == null) {
        			result = l2;
        			tail = result;
        		}
        		else {
        			tail.next = l2;
        			tail = tail.next;
        		}
        		l2 = l2.next;
        	}
        }
        while(l1 != null) {
			tail.next = l1;
			tail = tail.next;
    		l1 = l1.next;
        }
        while(l2 != null) {
			tail.next = l2;
			tail = tail.next;
    		l2 = l2.next;
        }
        return result;
    }
}